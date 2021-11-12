/**
 * 
 */
package com.example.blockchain.ethereum.web.mapper;

import java.nio.charset.StandardCharsets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.blockchain.ethereum.domain.ProposalTO;
import com.example.blockchain.ethereum.service.domain.ProposalVO;

/**
 * @author jagomez.rodriguez
 *
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN, imports = { StandardCharsets.class })
@Qualifier("proposalsControllerMapper")
public interface ProposalsControllerMapper {

	ProposalVO transformToVO(ProposalTO to);

	ProposalTO transformToTO(ProposalVO vo);

}
