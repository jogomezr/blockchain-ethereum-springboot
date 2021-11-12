package com.example.blockchain.ethereum.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.blockchain.ethereum.persistence.InitiativeDAO;
import com.example.blockchain.ethereum.persistence.entities.Initiative;
import com.example.blockchain.ethereum.service.InitiativeService;
import com.example.blockchain.ethereum.service.domain.InitiativeStatusEnum;
import com.example.blockchain.ethereum.service.domain.InitiativeVO;
import com.example.blockchain.ethereum.service.domain.ProposalVO;
import com.example.blockchain.ethereum.service.mapper.InitiativeServiceMapper;

/**
 * @author jagomez.rodriguez
 *
 */
@Service
public class InitiativeServiceImpl implements InitiativeService {

	private static final Long ZERO_VOTES = 0L;
	
	private InitiativeServiceMapper initiativeMapper;

	private InitiativeDAO initiativeDAO;

	public InitiativeServiceImpl(InitiativeServiceMapper initiativeMapper, InitiativeDAO initiativeDAO) {
		this.initiativeMapper = initiativeMapper;
		this.initiativeDAO = initiativeDAO;
	}

	@Override
	public List<InitiativeVO> getAll() {
		List<InitiativeVO> initiatives = new ArrayList<>();

		initiativeDAO.findAll().forEach(initiative -> initiatives.add(initiativeMapper.transformToVO(initiative)));

		return initiatives;
	}

	@Override
	public Optional<InitiativeVO> findById(Long id) {
		Optional<Initiative> initiative = initiativeDAO.findById(id);

		return initiative.isPresent() ? Optional.of(initiativeMapper.transformToVO(initiative.get())) : Optional.empty();
	}

	@Override
	public InitiativeVO add(InitiativeVO initiative) {
		Initiative entity = initiativeMapper.transformToEntity(initiative);
		entity.setCreationDate(LocalDateTime.now());
		entity.getProposals().stream().forEach(p -> {p.setInitiative(entity); p.setVotes(ZERO_VOTES);});
		
		Initiative createdEntity = initiativeDAO.save(entity);		
		
		return initiativeMapper.transformToVO(createdEntity);
	}

	@Override
	public void remove(Long id) {
		initiativeDAO.deleteById(id);
	}

	@Override
	public Optional<ProposalVO> getWinningProposal(Long id) {
		Optional<ProposalVO> proposal = Optional.empty();
		Optional<InitiativeVO> initiative = findById(id);
		
		if (initiative.isPresent() && initiative.get().getStatus() == InitiativeStatusEnum.FINISHED) {
			proposal = initiative.get().getProposals().stream().max((a,b) -> (int) (a.getVotes() - b.getVotes()));
		}
		
		return proposal;
	}

}
