package com.example.blockchain.ethereum.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.blockchain.ethereum.persistence.UserDAO;
import com.example.blockchain.ethereum.persistence.entities.User;
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
		List<UserVO> users = new ArrayList<>();

		userDAO.findAll().forEach(user -> users.add(userMapper.transformToVO(user)));

		return users;
	}

	@Override
	public Optional<UserVO> findById(Long id) {
		Optional<User> user = userDAO.findById(id);

		return user.isPresent() ? Optional.of(userMapper.transformToVO(user.get())) : Optional.empty();
	}

	@Override
	public UserVO login(String usermane, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
