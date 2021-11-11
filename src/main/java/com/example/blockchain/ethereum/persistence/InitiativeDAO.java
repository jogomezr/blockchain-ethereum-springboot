package com.example.blockchain.ethereum.persistence;

import org.springframework.data.repository.CrudRepository;

import com.example.blockchain.ethereum.persistence.entities.Initiative;

/**
 * @author jagomez.rodriguez
 *
 */
public interface InitiativeDAO extends CrudRepository<Initiative, Long>{

}
