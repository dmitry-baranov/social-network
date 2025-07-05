//package com.dmitrii.socialnetwork.service;
//
//import com.dmitrii.socialnetwork.controller.AuthController;
//import com.dmitrii.socialnetwork.dao.UserRepository;
//import com.dmitrii.socialnetwork.dao.entity.UserEntity;
//import com.dmitrii.socialnetwork.security.JwtTokenProvider;
//import java.util.Optional;
//import java.util.UUID;
//import java.util.concurrent.ConcurrentHashMap;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthService {
//
//  private final UserRepository repo;
//  private final UserService userService;
//  private final JwtTokenProvider tokenProvider;
//  private final ConcurrentHashMap<String, UUID> tokenStore = new ConcurrentHashMap<>();
//
//  public AuthService(UserRepository repo, UserService userService, JwtTokenProvider tokenProvider) {
//    this.repo = repo;
//    this.userService = userService;
//    this.tokenProvider = tokenProvider;
//  }
//
//  public Optional<String> authenticate(AuthController.LoginRequest loginRequest) {
//    Optional<UserEntity> userOpt = repo.findById(loginRequest.uuid());
//    if (userOpt.isPresent() && userService.checkPassword(userOpt.get(), password)) {
//      String token = tokenProvider.generateToken();
//      tokenStore.put(token, id);
//      return Optional.of(token);
//    }
//    return Optional.empty();
//  }
//
//  public Optional<UUID> getUserIdByToken(String token) {
//    return Optional.ofNullable(tokenStore.get(token));
//  }
//}
