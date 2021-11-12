package com.example.blockchain.ethereum.service.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jagomez.rodriguez
 *
 */
public class InitiativeVO implements Serializable {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 6898731469071491608L;

	private Long id;

	private String name;

	private String description;

	private LocalDateTime creationDate;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private InitiativeStatusEnum status;

	private List<ProposalVO> proposals = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public List<ProposalVO> getProposals() {
		return proposals;
	}

	public void setProposals(List<ProposalVO> proposals) {
		this.proposals = proposals;
	}

	public InitiativeStatusEnum getStatus() {
		return calculateStatus();
	}

	public InitiativeStatusEnum calculateStatus() {
		LocalDateTime now = LocalDateTime.now();

		if (now.compareTo(startDate) < 0) {
			status = InitiativeStatusEnum.PENDING;
		} else if (now.compareTo(endDate) < 0) {
			status = InitiativeStatusEnum.ACTIVE;
		} else {
			status = InitiativeStatusEnum.FINISHED;
		}

		return status;
	}
	
	public Long getNumProposals() {
		return (long) proposals.size();
	}

}
