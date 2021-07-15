package com.lnu.signinsys.dao;
/**
 * 查询 增加 输出所有签到信息
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnu.signinsys.entity.Qd;

/**
 * @author Administrator
 *
 */
public class QdDao extends BaseDao{
	
	// ctrl+shift+o
	//通过学生名字查询
	public Qd selectByStuName(String stuName){
		Qd qd = null;
		String sql = "select * from qd where stuName=?";
		try {
			
			PreparedStatement pst = getConn().prepareStatement(sql);
			
			pst.setString(1, stuName);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()){
				qd = new Qd(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return qd;
	}
	
	//增加（学生签到）
	public int insertQd(Qd qd){
		int num = 0;
		String sql = "insert into qd values(null,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pst = getConn().prepareStatement(sql);
			
			pst.setString(1, qd.getStuName());
			pst.setString(2, qd.getStuSex());
			pst.setString(3, qd.getStuFaculty());
			pst.setString(4, qd.getStuClass());
			pst.setInt(5, qd.getCourseId());
			pst.setString(6, qd.getPassword());
			
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
	public List<Qd> selectAllQd() {
		List<Qd> qdlist = new ArrayList<Qd>();
		String sql = "select * from qd";
		try {

			PreparedStatement pst = getConn().prepareStatement(sql);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Qd qd = new Qd(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
				qdlist.add(qd);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return qdlist;
	}
	
	// main alt+/
	public static void main(String[] args) {
		
		QdDao qddao = new QdDao();
		
		
		Qd qd3 = new Qd(1,"wangbingbing","female","art","class",1,"1234567");
		qddao.insertQd(qd3);
		System.out.println(qd3);
		
		Qd qd = qddao.selectByStuName("wangbingbing");
		System.out.println(qd);
		
	}
}

