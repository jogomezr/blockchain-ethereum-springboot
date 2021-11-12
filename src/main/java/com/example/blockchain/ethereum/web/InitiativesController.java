package com.example.blockchain.ethereum.web;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.blockchain.ethereum.api.InitiativesApi;
import com.example.blockchain.ethereum.domain.InitiativeDetailsTO;
import com.example.blockchain.ethereum.domain.InitiativeTO;
import com.example.blockchain.ethereum.domain.NewInitiativeTO;
import com.example.blockchain.ethereum.domain.ProposalTO;
import com.example.blockchain.ethereum.service.InitiativeService;
import com.example.blockchain.ethereum.service.domain.InitiativeVO;
import com.example.blockchain.ethereum.service.domain.ProposalVO;
import com.example.blockchain.ethereum.web.mapper.InitiativesControllerMapper;
import com.example.blockchain.ethereum.web.mapper.ProposalsControllerMapper;

/**
 * @author jagomez.rodriguez
 *
 */
@RestController
@CrossOrigin
public class InitiativesController implements InitiativesApi {

	private InitiativeService initiativeService;
	private InitiativesControllerMapper initiativeMapper;
	private ProposalsControllerMapper proposalMapper;

	public InitiativesController(InitiativeService initiativeService, InitiativesControllerMapper initiativeMapper,
			ProposalsControllerMapper proposalMapper) {
		this.initiativeService = initiativeService;
		this.initiativeMapper = initiativeMapper;
		this.proposalMapper = proposalMapper;
	}

	@Override
	public ResponseEntity<InitiativeDetailsTO> _createInitiative(@Valid NewInitiativeTO newInitiative) {
		InitiativeVO initiative = initiativeMapper.transformToVO(newInitiative);

		InitiativeVO createdInitiative = initiativeService.add(initiative);

		return new ResponseEntity<>(initiativeMapper.transformToDetailsTO(createdInitiative), HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<Void> _deleteInitiativeById(Long initiativeId) {
		initiativeService.remove(initiativeId);

		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<List<InitiativeTO>> _getAllInitiatives() {
		List<InitiativeVO> initiatives = initiativeService.getAll();

		List<InitiativeTO> payload = initiatives.stream().map(vo -> initiativeMapper.transformToTO(vo))
				.collect(Collectors.toList());

		final HttpStatus status = payload.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;

		return new ResponseEntity<>(payload, status);
	}

	@Override
	public ResponseEntity<InitiativeDetailsTO> _getInitiativeById(Long initiativeId) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		InitiativeDetailsTO payload = null;

		Optional<InitiativeVO> initiative = initiativeService.findById(initiativeId);

		if (initiative.isPresent()) {
			status = HttpStatus.ACCEPTED;
			payload = initiativeMapper.transformToDetailsTO(initiative.get());
		}

		return new ResponseEntity<>(payload, status);
	}

	@Override
	public ResponseEntity<ProposalTO> _getWinningProposal(Long initiativeId) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		ProposalTO payload = null;

		Optional<ProposalVO> proposal = initiativeService.getWinningProposal(initiativeId);

		if (proposal.isPresent()) {
			status = HttpStatus.ACCEPTED;
			payload = proposalMapper.transformToTO(proposal.get());
		}

		return new ResponseEntity<>(payload, status);
	}

}
