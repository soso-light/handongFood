package com.handong.somoon.login;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.handong.somoon.login.UserVO;

@Repository
public class UserDAO {

	@Autowired
	SqlSessionTemplate sqlSession;
	public UserVO getUser(UserVO vo) {
		return sqlSession.selectOne("User.getUser", vo);
	}
	
	public int insertAdmin() {
		int result = sqlSession.insert("User.insertAdmin");
		return result;
	}
}