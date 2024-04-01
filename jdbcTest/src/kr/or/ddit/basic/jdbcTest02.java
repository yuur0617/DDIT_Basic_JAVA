package kr.or.ddit.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcTest02 {

	public static void main(String[] args) {
		Scanner c= new Scanner(System.in);
		System.out.println("숫자 입력 :");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int b = c.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc07", "java");

			String sql = "select * from lprod where lprod_id >" + b;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("==쿼리문 처리 결과");

			while (rs.next()) {
				System.out.println("LPROD ID=" + rs.getInt(1));
				System.out.println("LPROD GU=" + rs.getString(2));
				System.out.println("LPROD NM=" + rs.getString(3));
				System.out.println("------------------------------------");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();} catch (SQLException e) {}
			if (rs != null)
				try {
					rs.close();} catch (SQLException e) {}
			if (rs != null)
				try {rs.close();} catch (SQLException e) {}
		}
	}

}
