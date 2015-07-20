/**
 * 
 */
package com.zzm.findwater.controller;

import java.util.HashMap;
import java.util.Map;
import static com.zzm.findwater.util.UtilKey.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zzm.findwater.bean.User;
import com.zzm.findwater.dao.UserDao;

/**
 * @author water 2015-7-6
 *
 */
@Controller
public class LoginController {
	
	@Resource(name="com.zzm.findwater.dao.mysql.userDaoImpl")
	private UserDao userDao;
	
	/**
	 * login page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView pageLoad(HttpServletRequest request){
		
		return new ModelAndView("login");
	}
	
	/**
	 * post login data
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request){
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Map<String,Object> data = new HashMap<String,Object>();
		
		User user  = new User(username,password);
		User userExist = userDao.getUserWithName(user);
		if(userExist != null){
			User userValidated = userDao.getUser(user);
			if(userValidated != null){
				request.getSession(true).setAttribute(USER, userValidated);
				return new ModelAndView("redirect:/home.html");
			}else{
				data.put("PASSWORD_INVALID", true);
				return new ModelAndView("login",data);
			}
			
		}else{
			data.put("USER_INVALID", true);
			return new ModelAndView("login",data);
		}
		
	}

}
