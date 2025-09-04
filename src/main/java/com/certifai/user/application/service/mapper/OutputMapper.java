package com.certifai.user.application.service.mapper;

import com.certifai.user.domain.User;
import com.certifai.user.infrastructure.persistence.jpa.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OutputMapper {

  User toDomain(UserEntity userEntity);
  UserEntity toEntity(User domain);
}
