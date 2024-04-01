package kr.or.ddit.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC(Java DataBase Connectivity) ���̺귯���� �̿��� DB�ڷḦ ó���ϴ� ����
public class JdbcTest01 {
/*
	���ó�� ����
1. ����̹� �ε� ==> ���̺귯���� ����Ҽ��ְ� �޸𸮷� �о� ���̴� �۾�
	==>JDBC���� 4.9�̻󿡼��� getConnection() �޼��忡�� �ڵ����� �ε��� ���ش�.
	       �׷��� ���� �����ϴ�. (�׷����� �������� �ʰ� ����� ����)
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
2. DB�ý��ۿ� �����ϱ� ==> ������ �Ϸ�Ǹ� Connection��ü�� ��ȯ�ȴ�.
	DriverManager.getCOnnection() �޼��带 �̿��Ѵ�.
	
3. ���� ==> SQL ������ DB������ ������ ����� ���´�.
	(Statement ��ü �Ǵ� PreparedStatement��ü�� �̿��Ͽ� �۾��Ѵ�.)
	
4. ��� ó�� �۾�
	1) SQL�� select���� ��쿡�� select�� ����� ResultSet��ü�� ����Ǿ� ��ȯ�ȴ�. 
	2) SQL���� select���� �ƴ� ���(insert��, delete��, update�� ��)����
	    �������� ��ȯ�ȴ�. (�� ���� ���� ���� ���࿡ ������ ���ڵ� ���� �ǹ��Ѵ�.)
	    
5. ����� �ڿ��� �ݳ��Ѵ�. ==> �� ��ü�� close() �޼��带 �̿��Ѵ�. 
*/
	public static void main(String[] args) {
		//DB �۾��� �ʿ��� ���� ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. ����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc06", "java");
			
			// 3. ����
			// 3-1. SQL�� �ۼ�
			String sql = "select * from lprod";
			
			// 3-2. Statement��ü �����Ѵ�. ==> ���Ǹ� ó���ϴ� ��ü
			stmt = conn.createStatement();
			
			// 3-3. SQL���� DB������ �����ϰ� DB������ ó���� ����� ���´�.
			//		(������ ������ SQL���� select���̱� ������ ����� 
			//       ResultSet��ü�� ����Ǿ� ��ȯ�ȴ�.)
			rs = stmt.executeQuery(sql);
			
			// 4. ��� ó���ϱ� ==> �� ���ڵ徿 ȭ�鿡 ����ϱ�
			
			// ResultSet�� ����� �����͸� ���ʷ� ���� ������ �ݺ����� next()���� ����ؼ� ó���Ѵ�.
			System.out.println(" == ������ ó�� ��� ==");
			// rs.next() �޼��� ==> rs��ü�� �����͸� ����Ű�� �����͸� ������° ���ڵ���ġ�� 
			// 					  �̵���Ű�� �� ���� �����Ͱ� ������ true, �׷��� ������ false�� ��ȯ�Ѵ�.
			while(rs.next()) {
				// �����Ͱ� ����Ű�� ���� �ڷḦ �������� ���
				// ���1) rs.get�ڷ����̸�("�÷��� �Ǵ� Alias��)
				// ����2) rs.get�ڷ����̸�(�÷���ȣ)  ==> �÷���ȣ�� 1���� �����Ѵ�.
				System.out.println("LPROD_ID :" + rs.getInt("lprod_id"));
				System.out.println("LPROD_GU :" + rs.getString(2));
				System.out.println("LPROD_NM :" + rs.getNString("LPROD_NM"));
				System.out.println("---------------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. �ڿ��ݳ�
			if(rs != null) try {rs.close(); } catch(SQLException e) {}
			if(stmt != null) try {stmt.close(); } catch(SQLException e) {}
			if(conn != null) try {conn.close(); } catch(SQLException e) {}
		}
	}
}
