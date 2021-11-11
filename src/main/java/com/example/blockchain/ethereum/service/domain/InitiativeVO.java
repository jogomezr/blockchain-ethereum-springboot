package com.example.blockchain.ethereum.service.domain;

import java.io.Serializable;
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

	private OffsetDateTime creationDate;

	private OffsetDateTime startDate;

	private OffsetDateTime endDate;

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

	public OffsetDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(OffsetDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public OffsetDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}

	public OffsetDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(OffsetDateTime endDate) {
		this.endDate = endDate;
	}

	public List<ProposalVO> getProposals() {
		return proposals;
	}

	public void setProposals(List<ProposalVO> proposals) {
		this.proposals = proposals;
	}

	public InitiativeStatusEnum getStatus() {
		return status;
	}

	public InitiativeStatusEnum calculateStatus() {

		return status;
	}

}
