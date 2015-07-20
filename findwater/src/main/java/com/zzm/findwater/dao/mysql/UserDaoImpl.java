/**
 * 
 */
package com.zzm.findwater.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.zzm.findwater.bean.User;
import com.zzm.findwater.dao.UserDao;

/**
 * @author water 2015-7-19
 *
 */
@Service("com.zzm.findwater.dao.mysql.userDaoImpl")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String getUserSQL = 
			"select id,username from user where username=? and password=?";
	private final String getUserByNameSQL = 
			"select id,username from user where username=? ";
	private final String validateUserSQL = 
			"select id,username from user where username=? and password=?";

	
	/* (non-Javadoc)
	 * @see com.zzm.findwater.dao.UserDao#validateUser(com.zzm.findwater.bean.User)
	 */
	public int validateUser(User user) {
		return 1;
	}
	
	
	/* (non-Javadoc)
	 * @see com.zzm.findwater.dao.UserDao#getUserWithName(com.zzm.findwater.bean.User)
	 */
	public User getUserWithName(User user) {
		List<User> userList = jdbcTemplate.query(
				getUserByNameSQL, 
				new Object[]{user.getUsername()}, 
				new RowMapper<User>(){
					
					public User mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						
						User user = new User();
						user.setId(rs.getInt("id"));
						user.setUsername(rs.getString("username"));
						
						return user;
					}
				});
				
		if(userList != null && !userList.isEmpty()){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	/* 
	 * get User info 
	 * must have one recode 
	 * @see com.zzm.findwater.dao.UserDao#validUser(com.zzm.findwater.bean.User)
	 */
	public User getUser(User user) {
		
		List<User> userList = jdbcTemplate.query(
				getUserSQL, 
				new Object[]{user.getUsername(),user.getPassword()}, 
				new RowMapper<User>(){
					
					public User mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						
						User user = new User();
						user.setId(rs.getInt("id"));
						user.setUsername(rs.getString("username"));
						
						return user;
					}
				});
				
		if(userList != null && !userList.isEmpty()){
			return userList.get(0);
		}else{
			return null;
		}
		
//		return jdbcTemplate.queryForObject(
//				getUserSQL, 
//				new Object[]{user.getUsername(),user.getPassword()}, 
//				new RowMapper<User>(){
//					
//					public User mapRow(ResultSet rs, int rowNum)
//							throws SQLException {
//						
//						User user = new User();
//						user.setId(rs.getInt("id"));
//						user.setUsername(rs.getString("username"));
//						
//						return user;
//					}
//				});
	}

}
