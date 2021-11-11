package com.example.blockchain.ethereum.web.mapper;

import java.nio.charset.StandardCharsets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.blockchain.ethereum.domain.UserTO;
import com.example.blockchain.ethereum.service.domain.UserVO;

/**
 * @author jagomez.rodriguez
 *
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN, imports = { StandardCharsets.class })
@Qualifier("usersControllerMapper")
public interface UsersControllerMapper {

	UserVO transformToVO(UserTO to);

	UserTO transformToTO(UserVO vo);

}
