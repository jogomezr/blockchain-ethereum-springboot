package com.example.blockchain.ethereum.service.mapper;

import java.nio.charset.StandardCharsets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.blockchain.ethereum.persistence.entities.User;
import com.example.blockchain.ethereum.service.domain.UserVO;

/**
 * @author jagomez.rodriguez
 *
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN, imports = { StandardCharsets.class })
@Qualifier("userServiceMapper")
public interface UserServiceMapper {

	UserVO transformToVO(User entity);

	User transformToEntity(UserVO vo);

}
