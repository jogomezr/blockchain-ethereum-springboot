package com.example.blockchain.ethereum.web.mapper;

import java.nio.charset.StandardCharsets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.blockchain.ethereum.domain.InitiativeDetailsTO;
import com.example.blockchain.ethereum.domain.InitiativeTO;
import com.example.blockchain.ethereum.domain.NewInitiativeTO;
import com.example.blockchain.ethereum.service.domain.InitiativeVO;

/**
 * @author jagomez.rodriguez
 *
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN, imports = { StandardCharsets.class })
@Qualifier("initiativesControllerMapper")
public interface InitiativesControllerMapper {

	InitiativeVO transformToVO(InitiativeTO to);
	
	InitiativeVO transformToVO(NewInitiativeTO vo);

	InitiativeDetailsTO transformToDetailsTO(InitiativeVO vo);

	InitiativeTO transformToTO(InitiativeVO vo);

}
