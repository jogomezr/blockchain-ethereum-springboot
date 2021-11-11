package com.example.blockchain.ethereum.service.mapper;

import java.nio.charset.StandardCharsets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.blockchain.ethereum.persistence.entities.Initiative;
import com.example.blockchain.ethereum.service.domain.InitiativeVO;

/**
 * @author jagomez.rodriguez
 *
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN, imports = { StandardCharsets.class })
@Qualifier("initiativeServiceMapper")
public interface InitiativeServiceMapper {

	InitiativeVO transformToVO(Initiative entity);

	Initiative transformToEntity(InitiativeVO vo);

}
