package com.certifai.user.application.service;

import com.certifai.user.application.port.in.RegisterUser;
import com.certifai.user.application.port.out.UserGateway;
import com.certifai.user.domain.User;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService implements RegisterUser {

  private final UserGateway userGateway;

  public RegisterUserService(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  @Override
  public User execute(User user) {
    return userGateway.persist(user);
  }
}
