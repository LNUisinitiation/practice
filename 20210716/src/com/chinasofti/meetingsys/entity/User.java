/**
* All rights Reserved, Designed By www.chinasofti.com 
* @Title: User.java
* @Package com.chinasofti.meetingsys.entity
* @Description: TODO(�û�ʵ����)
* @author: ������
* @date: 2021��6��19�� ����9:02:08
* @version V1.0
* @Copyright: 2021 www.chinasofti.com Inc. All rights reserved.
* ע�⣺�����ݽ���������������ѵ���ģ���ֹ��й�Լ�������������ҵĿ��
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
	//(select all) �вι���
	//(deselect all) �޲ι���
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
