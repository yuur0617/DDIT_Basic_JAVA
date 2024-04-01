package kr.or.ddit.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcTest03 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs=null;
		    
		System.out.println("숫자 입력 :");
		int b = s.nextInt();
		System.out.println("숫자 입력 :");
		int c = s.nextInt();
		int temp = 0;
		if(b>c) {
			temp=b;
		    b=c;
		    c=temp;
		}
		try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    conn  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc07","java");
		    String sql = "select * from lprod where lprod_id between "+b+" and "+c;
		    stmt = conn.createStatement();
		  	rs=stmt.executeQuery(sql);
		   	System.out.println("=========쿼리문 처리 결과============");
		    	
		    while(rs.next()) {
		    	System.out.println("LPROD ID=" + rs.getInt(1));
				System.out.println("LPROD GU=" + rs.getString(2));
				System.out.println("LPROD NM=" + rs.getString(3));
				System.out.println("------------------------------------");

		    }
		}catch (Exception e) {
		    e.printStackTrace();
		}finally {
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
