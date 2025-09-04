package com.certifai.user.application.service.mapper;

import com.certifai.user.domain.User;
import com.certifai.user.gateway.persistence.jpa.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OutputMapper {

  User toDomain(UserEntity userEntity);

  @Mapping(target = "id", ignore = true)
  UserEntity toEntity(User domain);
}
