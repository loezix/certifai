package com.certifai.user.gateway.presentation.http;

import com.certifai.user.application.port.in.RegisterUser;
import com.certifai.user.application.service.mapper.InputMapper;
import com.certifai.user.gateway.presentation.http.resource.UserRequestBody;
import com.certifai.user.gateway.presentation.http.resource.UserResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  private final InputMapper inputMapper;
  private final RegisterUser registerUser;

  public UserController(InputMapper inputMapper, RegisterUser registerUser) {
    this.inputMapper = inputMapper;
    this.registerUser = registerUser;
  }

  @PostMapping
  ResponseEntity<UserResource> register(@RequestBody UserRequestBody userRequestBody) {
    final var user = registerUser.execute(inputMapper.toDomain(userRequestBody));
    final var userResource = inputMapper.toResource(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(userResource);
  }
}
