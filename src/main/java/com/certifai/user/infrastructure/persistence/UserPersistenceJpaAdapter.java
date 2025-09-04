package com.certifai.user.infrastructure.persistence;

import com.certifai.user.application.port.out.UserGateway;
import com.certifai.user.domain.User;
import com.certifai.user.application.service.mapper.OutputMapper;
import com.certifai.user.infrastructure.persistence.jpa.UserRepositoryJpa;
import org.springframework.stereotype.Component;

@Component
public class UserPersistenceJpaAdapter implements UserGateway {

  private final UserRepositoryJpa repository;
  private final OutputMapper outputMapper;

  public UserPersistenceJpaAdapter(UserRepositoryJpa repository, OutputMapper outputMapper) {
    this.repository = repository;
    this.outputMapper = outputMapper;
  }

  @Override
  public User save(User user) {
    final var result = repository.save(outputMapper.toEntity(user));
    return outputMapper.toDomain(result);
  }
}
