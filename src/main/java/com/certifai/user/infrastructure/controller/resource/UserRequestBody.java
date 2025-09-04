package com.certifai.user.infrastructure.controller.resource;

public record UserRequestBody(String username, String email, String password) {
}
