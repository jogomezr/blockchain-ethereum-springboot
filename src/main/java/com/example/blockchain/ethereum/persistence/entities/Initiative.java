package com.example.blockchain.ethereum.persistence.entities;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author jagomez.rodriguez
 *
 */
@Entity
@Table(name = "INITIATIVES")
public class Initiative implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 2997135892415342133L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	@Column(name = "CREATION_DATE", columnDefinition = "TIME WITH TIME ZONE", nullable = false)
	private OffsetDateTime creationDate;

	@Column(name = "START_DATE", columnDefinition = "TIME WITH TIME ZONE", nullable = false)
	private OffsetDateTime startDate;

	@Column(name = "END_DATE", columnDefinition = "TIME WITH TIME ZONE", nullable = false)
	@org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
	private OffsetDateTime endDate;

	@OneToMany(mappedBy = "initiative", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Proposal> proposals;

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

	public List<Proposal> getProposals() {
		return proposals;
	}

	public void setProposals(List<Proposal> proposals) {
		proposals.forEach(p -> p.setInitiative(this));
		this.proposals = proposals;
	}

	public boolean addProposal(Proposal proposal) {
		proposal.setInitiative(this);
		return proposals.add(proposal);
	}

	public boolean removeProposal(Proposal proposal) {
		return proposals.remove(proposal);
	}

}
