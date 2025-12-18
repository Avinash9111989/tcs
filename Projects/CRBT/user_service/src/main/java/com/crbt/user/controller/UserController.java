package com.crbt.user.controller;

import com.crbt.user.model.User;
import com.crbt.user.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private static final Logger log = LogManager.getLogger(UserController.class);

    private final UserService service; // constructor-injected by Lombok

    @PostMapping("/register")
    public ResponseEntity<User> register(@Valid @RequestBody User user) {
        log.info("Register request received for username={}", user.getUsername());
        User savedUser = service.register(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username,
                                        @RequestParam String password) {
        log.info("Login attempt for username={}", username);
        String token = service.login(username, password);
        return ResponseEntity.ok(token);
    }
}
