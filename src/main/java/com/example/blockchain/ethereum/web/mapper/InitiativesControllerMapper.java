package com.example.blockchain.ethereum.web.mapper;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
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
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN, imports = { StandardCharsets.class, LocalDateTime.class, DateTimeFormatter.class })
@Qualifier("initiativesControllerMapper")
public interface InitiativesControllerMapper {

	@Mapping(expression = "java(LocalDateTime.parse(to.getCreationDate(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "creationDate")
	@Mapping(expression = "java(LocalDateTime.parse(to.getStartDate(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "startDate")
	@Mapping(expression = "java(LocalDateTime.parse(to.getEndDate(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "endDate")
	InitiativeVO transformToVO(InitiativeTO to);
	
	@Mapping(expression = "java(LocalDateTime.parse(to.getStartDate(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "startDate")
	@Mapping(expression = "java(LocalDateTime.parse(to.getEndDate(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "endDate")
	InitiativeVO transformToVO(NewInitiativeTO to);

	@Mapping(expression = "java(vo.getCreationDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "creationDate")
	@Mapping(expression = "java(vo.getStartDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "startDate")
	@Mapping(expression = "java(vo.getEndDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "endDate")
	InitiativeDetailsTO transformToDetailsTO(InitiativeVO vo);

	@Mapping(expression = "java(vo.getCreationDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "creationDate")
	@Mapping(expression = "java(vo.getStartDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "startDate")
	@Mapping(expression = "java(vo.getEndDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))", target = "endDate")
	InitiativeTO transformToTO(InitiativeVO vo);

}
