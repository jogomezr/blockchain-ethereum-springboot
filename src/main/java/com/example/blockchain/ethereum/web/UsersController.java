package com.example.blockchain.ethereum.web;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.blockchain.ethereum.api.UsersApi;
import com.example.blockchain.ethereum.domain.LoginRequestTO;
import com.example.blockchain.ethereum.domain.UserTO;
import com.example.blockchain.ethereum.service.UserService;
import com.example.blockchain.ethereum.service.domain.UserVO;
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
		List<UserVO> users = userService.getUsers();

		List<UserTO> payload = users.stream().map(vo -> userMapper.transformToTO(vo)).collect(Collectors.toList());

		final HttpStatus status = payload.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;

		return new ResponseEntity<>(payload, status);
	}

	@Override
	public ResponseEntity<UserTO> _getUserById(Long userId) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		UserTO payload = null;
		
		Optional<UserVO> user = userService.findById(userId);

		if (user.isPresent()) {
			status = HttpStatus.OK;
			payload = userMapper.transformToTO(user.get());
		}

		return new ResponseEntity<>(payload, status);
	}

	@Override
	public ResponseEntity<UserTO> _loginUser(@Valid LoginRequestTO loginRequest) {

		return null;
	}

}
