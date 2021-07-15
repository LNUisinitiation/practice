package com.lnu.signinsys.dao;
/**
 * 查询 增加 输出所有课程信息
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.lnu.signinsys.entity.Qd;
import com.lnu.signinsys.entity.Shc;

/**
 * @author Administrator
 *
 */
public class ShcDao extends BaseDao{
	
	// ctrl+shift+o
	//通过课程名字查询
	public Shc selectByCourseName(String courseName){
		Shc shc = null;
		String sql = "select * from shc where courseName=?";
		try {
			
			PreparedStatement pst = getConn().prepareStatement(sql);
			
			pst.setString(1, courseName);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()){
				shc = new Shc(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shc;
	}
	
	//增加（学生签到）
	public int insertShc(Shc shc){
		int num = 0;
		String sql = "insert into shc values(?,?,?)";
		
		try {
			PreparedStatement pst = getConn().prepareStatement(sql);
			
			pst.setInt(1, shc.getCourseId());
			pst.setString(2, shc.getCourseName());
			pst.setString(3, shc.getCourseTeacher());
			
			num = pst.executeUpdate();
			System.out.println("受影响的行数"+ num +"*");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
	
	// ctrl+shift+o
	//查询所有已签到的学生
	public List<Shc> selectAllShc() {
		List<Shc> shclist = new ArrayList<Shc>();
		String sql = "select * from shc";
		try {

			PreparedStatement pst = getConn().prepareStatement(sql);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Shc shc = new Shc(rs.getInt(1), rs.getString(2), rs.getString(3));
				shclist.add(shc);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shclist;
	}

	// main alt+/
	public static void main(String[] args) {
		
		ShcDao shcdao = new ShcDao();
		
		
		Shc shc3 = new Shc(1,"java","李冬");
		shcdao.insertShc(shc3);
		System.out.println(shc3);
		
		Shc shc = shcdao.selectByCourseName("database");
		System.out.println(shc);
		
	}
}

