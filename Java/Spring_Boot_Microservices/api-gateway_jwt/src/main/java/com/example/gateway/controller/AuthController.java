package com.example.gateway.controller;
import com.example.gateway.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
 @GetMapping("/auth/token")
 public String token(@RequestParam String user){
  return JwtUtil.generate(user);
 }
}