package com.zzm.findwater.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zzm.findwater.bean.Article;

@Controller
public class ArticleController {

	/**
	 * load one article
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/article", method = RequestMethod.GET)
	public ModelAndView articleLoad(HttpServletRequest request){
		
		Map<String, Object> modelData = new HashMap<String, Object>();
		return new ModelAndView("index",modelData);
	}
	
	
	@RequestMapping(value = "/article", method = RequestMethod.POST)
	public ModelAndView articlePost(HttpServletRequest request) throws UnsupportedEncodingException{
		
		Map<String, Object> modelData = new HashMap<String, Object>();
		String titleOriginal = request.getParameter("title");
		String title = new String(titleOriginal.getBytes("ISO-8859-1"),"UTF-8");
		String contentOriginal = request.getParameter("content");
		String content = new String(contentOriginal.getBytes("ISO-8859-1"),"UTF-8");
		
		
		Article oneArticle = new Article(title,content);
		modelData.put("article", oneArticle);
		
		return new ModelAndView("article",modelData);
	}
	
	

}
