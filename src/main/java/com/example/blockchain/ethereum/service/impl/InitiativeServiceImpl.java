package com.example.blockchain.ethereum.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blockchain.ethereum.persistence.InitiativeDAO;
import com.example.blockchain.ethereum.service.InitiativeService;
import com.example.blockchain.ethereum.service.domain.InitiativeVO;
import com.example.blockchain.ethereum.service.domain.ProposalVO;
import com.example.blockchain.ethereum.service.mapper.InitiativeServiceMapper;

/**
 * @author jagomez.rodriguez
 *
 */
@Service
public class InitiativeServiceImpl implements InitiativeService {

	private InitiativeServiceMapper initiativeMapper;

	private InitiativeDAO initiativeDAO;

	public InitiativeServiceImpl(InitiativeServiceMapper initiativeMapper, InitiativeDAO initiativeDAO) {
		this.initiativeMapper = initiativeMapper;
		this.initiativeDAO = initiativeDAO;
	}

	@Override
	public List<InitiativeVO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiativeVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiativeVO add(InitiativeVO initiative) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProposalVO getWinningProposal(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
