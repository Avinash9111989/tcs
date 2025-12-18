package com.crbt.user.security;



import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

 private static final Key KEY =
   Keys.hmacShaKeyFor("CRBT_AUTH_SERVICE_SECRET_256_BIT_KEY_123456".getBytes());

 public static String generateToken(String username, String role) {
  return Jwts.builder()
    .setSubject(username)
    .claim("role", role)
    .setIssuedAt(new Date())
    .setExpiration(new Date(System.currentTimeMillis() + 3600000))
    .signWith(KEY, SignatureAlgorithm.HS256)
    .compact();
 }
}
