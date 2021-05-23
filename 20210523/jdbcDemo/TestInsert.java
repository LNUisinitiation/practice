package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class TestInsert {

	public static void main(String[] args) {
		System.out.println("请输入：");
		String dname = new Scanner(System.in).next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/personnel?characterEncoding=utf-8", "root", "12345678");
			PreparedStatement stmt = conn.prepareStatement("insert into dept values(null,?)");
			stmt.setString(1, dname);
			int num = stmt.executeUpdate();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
