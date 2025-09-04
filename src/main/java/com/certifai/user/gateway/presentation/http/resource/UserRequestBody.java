package com.certifai.user.gateway.presentation.http.resource;

public record UserRequestBody(String username, String email, String password) {
}
