package com.certifai.user.application.port.out;

import com.certifai.user.domain.User;

public interface UserGateway {

  User persist(User user);
}
