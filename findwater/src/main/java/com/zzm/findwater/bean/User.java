/**
 * 
 */
package com.zzm.findwater.bean;

/**
 * @author water 2015-7-19
 *
 */
public class User {
	
	private int id;
	
	private String username;
	private String password;
	
	public User(){};
	
	public User(String name,String pass){
		this.username = name;
		this.password = pass;
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
	 * @return the user name
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the user name to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
