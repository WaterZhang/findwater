package com.zzm.findwater.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * article
 * 
 * @author water 2015-6-20
 *
 */
public class Article {
	
	private int id;
	
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	private String title;
	
	private String content;
	
	private Date updateDate;
	
	public Article(){
		
	}
	
	public Article(String article,String content){
		this.title = article;
		this.content = content;
	}
	
	
	/**
	 * for UI to display time 
	 * @return
	 */
	public String getDateStr(){
		return dateFormat.format(updateDate);
	}
	
	/**
	 * 1.remove html tag
	 * 2.sub string 200
	 * 
	 * @return
	 */
	public String getContentSub(){
		
		if(content.length() > 2000 )
			return content.substring(0, 2000);
		else
			return content;
	}
	
	
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}



	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
