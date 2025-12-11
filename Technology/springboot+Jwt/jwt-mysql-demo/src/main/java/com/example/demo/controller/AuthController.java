package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.security.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserRepository repo;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authManager;
    private final JwtUtil jwtUtil;

    public AuthController(UserRepository repo, PasswordEncoder pe, AuthenticationManager am, JwtUtil jwtUtil) {
        this.repo = repo;
        this.passwordEncoder = pe;
        this.authManager = am;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String,String> body) {
        String username = body.get("username");
        String rawPwd = body.get("password");
        if (repo.findByUsername(username).isPresent()) return ResponseEntity.badRequest().body("User exists");
        User u = new User();
        u.setUsername(username);
        u.setPassword(passwordEncoder.encode(rawPwd));
        repo.save(u);
        return ResponseEntity.ok("registered");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String,String> body) {
        try {
            var authToken = new UsernamePasswordAuthenticationToken(body.get("username"), body.get("password"));
            authManager.authenticate(authToken);
            String token = jwtUtil.generateToken(body.get("username"));
            return ResponseEntity.ok(Map.of("token", token));
        } catch (AuthenticationException ex) {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
