package jdbcDemo;

/**
 * JDBC的操作
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestRead {

	public static void main(String[] args) {

		try {
			// JDBC操作步骤：
			// 1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");// 驱动类名
			// 2.建立和数据库的连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/personnel?characterEncoding=utf-8", "root", "12345678");
			// 3.获取描述(Statement)对象
			PreparedStatement stmt = conn.prepareStatement("select * from v_dept order by deptId asc");
			// 4.执行(CDU：行数，R：结果集)
			ResultSet rs = stmt.executeQuery();
			// 5.(R)遍历结果集，取每一行的每一列的数据
			System.out.println("部门号\t" + "部门名\t\t" + "部门人数");
			while (rs.next()) {
				// 取列值，参数是结果集中的列名
				int did = rs.getInt("deptId");
				String dname = rs.getString("deptName");
				int num = rs.getInt("empNum");
				System.out.println("Id: " + did + "\tname: " + dname + "\tnum: " + num);
			}
			// 6.关闭资源(结果集，描述对象，连接对象)
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}