package com.example.blockchain.ethereum.service;

import java.util.List;

import com.example.blockchain.ethereum.service.domain.InitiativeVO;
import com.example.blockchain.ethereum.service.domain.ProposalVO;

/**
 * @author jagomez.rodriguez
 *
 */
public interface InitiativeService {

	List<InitiativeVO> getAll();
	
	InitiativeVO findById(Long id);
	
	InitiativeVO add(InitiativeVO initiative);
	
	void remove(Long id);
	
	ProposalVO getWinningProposal(Long id);

}
