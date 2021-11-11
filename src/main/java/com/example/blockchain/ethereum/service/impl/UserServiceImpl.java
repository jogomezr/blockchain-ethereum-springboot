package com.example.blockchain.ethereum.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blockchain.ethereum.persistence.UserDAO;
import com.example.blockchain.ethereum.service.UserService;
import com.example.blockchain.ethereum.service.domain.UserVO;
import com.example.blockchain.ethereum.service.mapper.UserServiceMapper;

/**
 * @author jagomez.rodriguez
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	private UserServiceMapper userMapper;
	
	private UserDAO userDAO;
	
	public UserServiceImpl(UserServiceMapper userMapper, UserDAO userDAO) {
		this.userMapper = userMapper;
		this.userDAO = userDAO;
	}

	@Override
	public List<UserVO> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO login(String usermane, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
