package com.example.blockchain.ethereum.service.domain;

import java.io.Serializable;

/**
 * @author jagomez.rodriguez
 *
 */
public class ProposalVO implements Serializable {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -5712628762777950666L;

	private Long id;

	private String name;

	private String image;

	private Long votes;

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

}
