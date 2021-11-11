package com.example.blockchain.ethereum.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.blockchain.ethereum.api.InitiativesApi;
import com.example.blockchain.ethereum.domain.InitiativeTO;
import com.example.blockchain.ethereum.domain.NewInitiativeTO;
import com.example.blockchain.ethereum.domain.ProposalTO;
import com.example.blockchain.ethereum.service.InitiativeService;

/**
 * @author jagomez.rodriguez
 *
 */
@RestController
@CrossOrigin
public class InitiativesController implements InitiativesApi {
	
	private InitiativeService initiativeService;

	public InitiativesController(InitiativeService initiativeService) {
		this.initiativeService = initiativeService;
	}
	
	@Override
	public ResponseEntity<NewInitiativeTO> _createInitiative(@Valid NewInitiativeTO newInitiative) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> _deleteInitiativeById(Long initiativeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<InitiativeTO>> _getAllInitiatives() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<InitiativeTO> _getInitiativeById(Long initiativeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ProposalTO> _getWinningProposal(Long initiativeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
