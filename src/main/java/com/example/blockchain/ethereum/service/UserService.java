package com.example.blockchain.ethereum.service;

import java.util.List;
import java.util.Optional;

import com.example.blockchain.ethereum.service.domain.UserVO;

/**
 * @author jagomez.rodriguez
 *
 */
public interface UserService {

	List<UserVO> getUsers();
	
	Optional<UserVO> findById(Long id);
	
	UserVO login(String usermane, String password);
	
}
