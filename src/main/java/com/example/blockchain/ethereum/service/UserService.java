package com.example.blockchain.ethereum.service;

import java.util.List;

import com.example.blockchain.ethereum.service.domain.UserVO;

/**
 * @author jagomez.rodriguez
 *
 */
public interface UserService {

	List<UserVO> getUsers();
	
	UserVO findById(Long id);
	
	UserVO login(String usermane, String password);
	
}
