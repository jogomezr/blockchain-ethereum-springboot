package com.example.blockchain.ethereum.persistence.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	@Column(name = "CREATION_DATE", columnDefinition = "TIME WITH TIME ZONE", nullable = false)
	private LocalDateTime creationDate;

	@Column(name = "START_DATE", columnDefinition = "TIME WITH TIME ZONE", nullable = false)
	private LocalDateTime startDate;

	@Column(name = "END_DATE", columnDefinition = "TIME WITH TIME ZONE", nullable = false)
	private LocalDateTime endDate;

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
