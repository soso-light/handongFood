package com.handong.somoon.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handong.somoon.login.UserVO;

@Service
public class UserServiceImpl {
	
	@Autowired
	UserDAO userDAO;
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
	public int insertAdmin() {
		return userDAO.insertAdmin();
	}
}