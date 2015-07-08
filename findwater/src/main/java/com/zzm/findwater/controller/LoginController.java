/**
 * 
 */
package com.zzm.findwater.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zzm.findwater.bean.Article;
import com.zzm.findwater.util.ArticleFactory;

/**
 * @author water 2015-7-6
 *
 */
@Controller
public class LoginController {
	
	/**
	 * login page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView pageLoad(HttpServletRequest request){
		
		
		return new ModelAndView("login");
	}

}
