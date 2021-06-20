/**
* All rights Reserved, Designed By www.chinasofti.com 
* @Title: UserService.java
* @Package com.chinasofti.meetingsys.service
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author: ������
* @date: 2021��6��19�� ����1:19:11
* @version V1.0
* @Copyright: 2021 www.chinasofti.com Inc. All rights reserved.
* ע�⣺�����ݽ���������������ѵ���ģ���ֹ��й�Լ�������������ҵĿ��
*/
package com.chinasofti.meetingsys.service;

import com.chinasofti.meetingsys.dao.UserDao;
import com.chinasofti.meetingsys.entity.User;

/**
 * @author Administrator
 *
 */
public class UserService {
	//�����    ҵ���߼�  ���չ��ܷ���    ����dao��
	UserDao userdao = new UserDao();
	
	public User login(String username,String password){
		//�����¼ʧ��
		//boolean success = false;
		//ͨ���û���д���û��������û�
		User user = userdao.selectByUsername(username);
		//����ҵ��ˣ��ж������Ƿ���ȷ
		if(user!=null && user.getPassword().equals(password)){
			//��ȷ���� true  ��¼�ɹ�
			return user;
		}
		return null;
	}
	
	//ע�Ṧ��
	public boolean regist(User user){
		boolean success = false;
		//�ж��Ƿ�����û�  ����Ѿ�����  ����ע��
		User user2 = userdao.selectByUsername(user.getUsername());
		if(user2==null){
			//û�д��û�  ����ע��
			int num = userdao.insertUser(user);
			if(num>0){
				success = true;
			}
		}
		return success;
	}
	
	//main   alt+/
	public static void main(String[] args) {
		UserService us = new UserService();
//		boolean flag = us.login("admin", "admin");
//		System.out.println(flag);
		
		System.out.println("-------分割线-------");
		User user = new User(1,"libingbing","123456");
		boolean flag2 = us.regist(user);
		System.out.println(flag2);
	}
	
}
