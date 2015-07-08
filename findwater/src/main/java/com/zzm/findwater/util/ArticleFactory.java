/**
 * 
 */
package com.zzm.findwater.util;

import java.util.Date;

import com.zzm.findwater.bean.Article;

/**
 * @author water 2015-6-22
 *
 * singleton design pattern
 */
public class ArticleFactory {
	
	private final String defaultTitle = ConfigurationsStore.getConfigValue("com.zzm.findwater.article.default.article");
	private final String defultContent = ConfigurationsStore.getConfigValue("com.zzm.findwater.article.default.content");
	
	private ArticleFactory(){
	}
	
	public static ArticleFactory getInstance(){
		return ActicleFactoryHolder.INSTANCE;
	}
	
	
	private static class ActicleFactoryHolder {
		private static ArticleFactory INSTANCE = new ArticleFactory();
	}
	
	/**
	 * return default article if no article in DB
	 * @return
	 */
	public Article getDefaultActicle(){
		Article defaultA = new Article();
		defaultA.setTitle(defaultTitle);
		defaultA.setContent(defultContent);
		defaultA.setUpdateDate(new Date());
		
		return defaultA;
	}
	
}
