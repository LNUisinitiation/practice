/**
* All rights Reserved, Designed By www.chinasofti.com 
* @Title: UserDao.java
* @Package com.chinasofti.meetingsys.dao
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author: ������
* @date: 2021��6��19�� ����10:23:01
* @version V1.0
* @Copyright: 2021 www.chinasofti.com Inc. All rights reserved.
* ע�⣺�����ݽ���������������ѵ���ģ���ֹ��й�Լ�������������ҵĿ��
*/
package com.chinasofti.meetingsys.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.meetingsys.entity.User;

/**
 * @author Administrator
 *
 */
public class UserDao extends BaseDao{
	//��//ɾ//��//�� byId//��ѯȫ��
	
	//��¼ 
	//��ѯ byUsername
	// ctrl+shift+o
	public User selectByUsername(String username){
		User user = null;
		String sql = "select * from user where username=?";
		try {
			//ͨ�����Ӷ�����������
			PreparedStatement pst = getConn().prepareStatement(sql);
			//ִ��֮ǰ��ȫsql���
			pst.setString(1, username);
			//ִ��sql���   �����
			ResultSet rs = pst.executeQuery();
			//�жϽ�����Ƿ���ֵ
			if(rs.next()){
				user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			//�ر���Դ
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	
	public int insertUser(User user){
		int num = 0;
		String sql = "insert into user values(null,?,?)";
		//ͨ�����Ӷ�����������
		try {
			PreparedStatement pst = getConn().prepareStatement(sql);
			//ִ��֮ǰ��ȫsql���
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			//ִ��sql���
			num = pst.executeUpdate();
			System.out.println("�����"+num+"������");
			//�ر���Դ
			pst.close();
			closeConn();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
	//��ѯ byUsername
		// ctrl+shift+o
		public List<User> selectAllUser(){
			List<User> userlist = new ArrayList<User>();
			String sql = "select * from user";
			try {
				//ͨ�����Ӷ�����������
				PreparedStatement pst = getConn().prepareStatement(sql);
				//ִ��sql���   �����
				ResultSet rs = pst.executeQuery();
				//�жϽ�����Ƿ���ֵ
				while(rs.next()){
					User user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
					userlist.add(user);
				}
				//�ر���Դ
				rs.close();
				pst.close();
				closeConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return userlist;
		}
	
		public int updateUser(User user){
			int num = 0;
			String sql = "update user set username=?,password=? where userId=?";
			//ͨ�����Ӷ�����������
			try {
				PreparedStatement pst = getConn().prepareStatement(sql);
				//ִ��֮ǰ��ȫsql���
				pst.setString(1, user.getUsername());
				pst.setString(2, user.getPassword());
				pst.setInt(3, user.getUserId());
				//ִ��sql���
				num = pst.executeUpdate();
				System.out.println("�޸���"+num+"������");
				//�ر���Դ
				pst.close();
				closeConn();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return num;
		}
	
	//ע��
	//����
	//main   alt+/
	public static void main(String[] args) {
		UserDao userdao = new UserDao();
		User user = userdao.selectByUsername("admin");
		System.out.println(user);
		
		User user2 = new User(1,"lisi","123");
		userdao.insertUser(user2);
	}
}
