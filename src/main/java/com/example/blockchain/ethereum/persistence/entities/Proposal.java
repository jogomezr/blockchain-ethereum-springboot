package com.example.blockchain.ethereum.persistence.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author jagomez.rodriguez
 *
 */
@Entity
@Table(name = "PROPOSALS")
public class Proposal implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 4869423851420661004L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "IMAGE", nullable = false)
	private String image;

	@Column(name = "VOTES", nullable = false)
	private Long votes;

	@ManyToOne(fetch = FetchType.LAZY)
	private Initiative initiative;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getVotes() {
		return votes;
	}

	public void setVotes(Long votes) {
		this.votes = votes;
	}

	public Initiative getInitiative() {
		return initiative;
	}

	public void setInitiative(Initiative initiative) {
		this.initiative = initiative;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proposal other = (Proposal) obj;
		return Objects.equals(id, other.id);
	}

}
