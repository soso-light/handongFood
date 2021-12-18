package com.handong.somoon.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.handong.somoon.login.UserVO;
import com.handong.somoon.login.UserServiceImpl;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	UserServiceImpl service;

	// 로그인 하는 부분
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String t, Model model) {
		return "login";
	}

	@RequestMapping(value = "/loginOk", method = RequestMethod.POST)
	public String loginCheck(HttpSession session, Model model, UserVO vo) {
		String returnURL = "";
		if (session.getAttribute("login") != null) {
			session.removeAttribute("login");

		}

		UserVO loginvo = service.getUser(vo);
		if (loginvo != null) { // 로그인 성공적으로 했다는 뜻
			System.out.println("로그인 성공!");
			session.setAttribute("login", loginvo);
			returnURL = "redirect:/board/list"; 
		} else {
			System.out.println("로그인 실패!");
			returnURL = "redirect:/login/login"; // 로그인 실패했다는 뜻
		}
		return returnURL;
	}

	// 회원가입 하는 부분
	@RequestMapping(value = "/insertAdmin", method = RequestMethod.GET)
	public String pageAdmin() throws Exception{
		return "insertAdmin";
	}
	
	@RequestMapping(value = "/insertok", method = RequestMethod.POST)
	public String insertAdmin(UserVO user, Model model) {

		int result = service.insertAdmin(user);
		String returnURL ="";
		if (result == 0) {
			//model.addAttribute("message", "같은 아이디가 있습니다.");
			System.out.println("같은 아이디가 있습니다.");
			returnURL = "insertAdmin";
		} else {
			returnURL =  "redirect:/login/login";
		}
		return returnURL;
	}

	// 로그아웃 하는 부분
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login/login";
	}
}
