/**
* All rights Reserved, Designed By www.chinasofti.com 
* @Title: UserDao.java
* @Package com.chinasofti.meetingsys.dao
* @Description: TODO(用一句话描述该文件做什么)
* @author: 尹艺霏
* @date: 2021年6月19日 上午10:23:01
* @version V1.0
* @Copyright: 2021 www.chinasofti.com Inc. All rights reserved.
* 注意：本内容仅限于沈阳中软培训传阅，禁止外泄以及用于其他的商业目的
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
	//增//删//改//查 byId//查询全部
	
	//登录 
	//查询 byUsername
	// ctrl+shift+o
	public User selectByUsername(String username){
		User user = null;
		String sql = "select * from user where username=?";
		try {
			//通过连接对象获得语句对象
			PreparedStatement pst = getConn().prepareStatement(sql);
			//执行之前补全sql语句
			pst.setString(1, username);
			//执行sql语句   结果集
			ResultSet rs = pst.executeQuery();
			//判断结果集是否有值
			if(rs.next()){
				user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			//关闭资源
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
		//通过连接对象获得语句对象
		try {
			PreparedStatement pst = getConn().prepareStatement(sql);
			//执行之前补全sql语句
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			//执行sql语句
			num = pst.executeUpdate();
			System.out.println("添加了"+num+"条数据");
			//关闭资源
			pst.close();
			closeConn();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
	//查询 byUsername
		// ctrl+shift+o
		public List<User> selectAllUser(){
			List<User> userlist = new ArrayList<User>();
			String sql = "select * from user";
			try {
				//通过连接对象获得语句对象
				PreparedStatement pst = getConn().prepareStatement(sql);
				//执行sql语句   结果集
				ResultSet rs = pst.executeQuery();
				//判断结果集是否有值
				while(rs.next()){
					User user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
					userlist.add(user);
				}
				//关闭资源
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
			//通过连接对象获得语句对象
			try {
				PreparedStatement pst = getConn().prepareStatement(sql);
				//执行之前补全sql语句
				pst.setString(1, user.getUsername());
				pst.setString(2, user.getPassword());
				pst.setInt(3, user.getUserId());
				//执行sql语句
				num = pst.executeUpdate();
				System.out.println("修改了"+num+"条数据");
				//关闭资源
				pst.close();
				closeConn();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return num;
		}
	
	//注册
	//增加
	//main   alt+/
	public static void main(String[] args) {
		UserDao userdao = new UserDao();
		User user = userdao.selectByUsername("admin");
		System.out.println(user);
		
		User user2 = new User(1,"lisi","123");
		userdao.insertUser(user2);
	}
}
