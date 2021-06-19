/**
* All rights Reserved, Designed By www.chinasofti.com 
* @Title: User.java
* @Package com.chinasofti.meetingsys.entity
* @Description: TODO(用户实体类)
* @author: 尹艺霏
* @date: 2021年6月19日 上午9:02:08
* @version V1.0
* @Copyright: 2021 www.chinasofti.com Inc. All rights reserved.
* 注意：本内容仅限于沈阳中软培训传阅，禁止外泄以及用于其他的商业目的
*/
package com.chinasofti.meetingsys.entity;

/**
 * @author Administrator
 *
 */
public class User {
	private int userId;
	private String username;
	private String password;
	
	//alt+shift+s
	//generate getters and setters
	//generate constructors using fields
	//(select all) 有参构造
	//(deselect all) 无参构造
	//generate toString()
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}
	

	
	
	
	
	
}
