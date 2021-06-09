package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chinasofti.entity.Dept;

public class DeptDao {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public static void main(String[] args) {
		System.out.println("请输入：");
		System.out.println("接下来的部门");
		String dname = new Scanner(System.in).next();
		

	}
	public List getList(){
		String sql = "select * from v_dept order by deptName asc";
		List list = new ArrayList();
		conn = BaseDao.getConn();
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int did = rs.getInt("deptId");// ȡ��ֵ�������ǽ�����е�����
				String dname = rs.getString("deptName");
				int num = rs.getInt("empNum");
				Dept dept = new Dept(did, dname, num);
				list.add(dept);//�������ŵ�List������
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally{
			BaseDao.closeAll(conn, stmt, rs);
		}
	}
	public int insert(Dept dept){
		String sql = "insert into dept values(null,?)";
		conn = BaseDao.getConn();
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, dept.getDeptName());
			return stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} finally{
			BaseDao.closeAll(conn, stmt, rs);
		}
		
	}
	
	public int delete(int id){
		String sql = "delete from dept where deptid = ?";
		conn = BaseDao.getConn();
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			return stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} finally{
			BaseDao.closeAll(conn, stmt, rs);
		}
	}
}
