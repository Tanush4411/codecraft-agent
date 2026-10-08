package com.chrizlove.account_service.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
