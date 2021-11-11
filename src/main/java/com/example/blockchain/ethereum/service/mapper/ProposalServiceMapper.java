package com.example.blockchain.ethereum.service.mapper;

import java.nio.charset.StandardCharsets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.blockchain.ethereum.persistence.entities.Proposal;
import com.example.blockchain.ethereum.service.domain.ProposalVO;

/**
 * @author jagomez.rodriguez
 *
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN, imports = { StandardCharsets.class })
@Qualifier("proposalServiceMapper")
public interface ProposalServiceMapper {

	ProposalVO transformToVO(Proposal entity);
	
	Proposal transformToEntity(ProposalVO vo);

}
