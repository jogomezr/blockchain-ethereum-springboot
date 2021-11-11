package com.example.blockchain.ethereum.persistence;

import org.springframework.data.repository.CrudRepository;

import com.example.blockchain.ethereum.persistence.entities.User;

/**
 * @author jagomez.rodriguez
 *
 */
public interface UserDAO extends CrudRepository<User, Long> {

}
