/**
 * 
 */
package com.zzm.findwater.dao;

import com.zzm.findwater.bean.User;

/**
 * @author water 2015-7-19
 *
 */
public interface UserDao {
	
	int validateUser(User user);
	/**
	 * only search by name
	 * @param user
	 * @return
	 */
	User getUserWithName(User user);
	/**
	 * search by name and password
	 * @param user
	 * @return
	 */
	User getUser(User user);

}
