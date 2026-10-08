package com.chrizlove.account_service.service;


import com.chrizlove.account_service.dto.auth.AuthResponse;
import com.chrizlove.account_service.dto.auth.LoginRequest;
import com.chrizlove.account_service.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
