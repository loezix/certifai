package com.certifai.user.application.port.in;

import com.certifai.user.domain.User;

public interface RegisterUser {

  User execute(User user);
}
