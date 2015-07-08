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
 * @author water 2015-6-22
 *
 */
@Controller
public class HomeController {
	
	
	/**
	 * portal for all user
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView pageLoad(HttpServletRequest request){
		
		Map<String, Object> modelData = new HashMap<String, Object>();
		
		//Set default article data 
		Article defaultArticle = ArticleFactory.getInstance().getDefaultActicle();
		modelData.put("defaultArticle", defaultArticle);
		
		return new ModelAndView("home",modelData);
	}

}
