package com.chrizlove.account_service.mapper;

import com.chrizlove.account_service.dto.auth.SignupRequest;
import com.chrizlove.account_service.dto.auth.UserProfileResponse;
import com.chrizlove.account_service.entity.User;
import com.chrizlove.common_lib.dto.UserDto;
import com.chrizlove.common_lib.security.JwtUserPrincipal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    @Mapping(source = "userId", target = "id")
    UserProfileResponse toUserProfileResponse(JwtUserPrincipal user);

    UserDto toUserDto(User user);

}
