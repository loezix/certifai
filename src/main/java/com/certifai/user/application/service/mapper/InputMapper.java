package com.certifai.user.application.service.mapper;

import com.certifai.user.domain.User;
import com.certifai.user.infrastructure.controller.resource.UserRequestBody;
import com.certifai.user.infrastructure.controller.resource.UserResource;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface InputMapper {

  User toDomain(UserRequestBody userRequestBody);
  UserResource toResource(User user);
}
