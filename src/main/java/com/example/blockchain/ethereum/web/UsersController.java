package com.example.blockchain.ethereum.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.blockchain.ethereum.api.UsersApi;
import com.example.blockchain.ethereum.domain.LoginRequestTO;
import com.example.blockchain.ethereum.domain.UserTO;
import com.example.blockchain.ethereum.service.UserService;
import com.example.blockchain.ethereum.web.mapper.UsersControllerMapper;

/**
 * @author jagomez.rodriguez
 *
 */
@RestController
@CrossOrigin
public class UsersController implements UsersApi {
	
	private UserService userService;
	private UsersControllerMapper userMapper;
	
	public UsersController(UserService userService, UsersControllerMapper userMapper) {
		this.userService = userService;
		this.userMapper = userMapper;
	}

	@Override
	public ResponseEntity<List<UserTO>> _getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<UserTO> _getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<UserTO> _loginUser(@Valid LoginRequestTO loginRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
