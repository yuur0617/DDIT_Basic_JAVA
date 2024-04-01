/* PreparedStatement ��ü�� �̿��� �� SQL �����Ͱ� �� �ڸ��� ����ǥ�� ǥ���ؼ� �ۼ��Ѵ�
		String sql = "select * from lprod where lprod_id between "+?+" and "+?;
	PreparedStatement ��ü ����
		psmt = conn.preparedStatement(������);
	SQL �� ����ǥ �ڸ��� �� �����͸� set
	���� ) PreparedStatement ��ü.set�ڷ����̸�(����ǥ ��ȣ,������ ������)
		String sql = "select * from lprod where lprod_id between "+?+" and "+?;
		pstmt.setInt(1,num1)
		pstmt.setInt(2,num2)
	������ ���� �Ϸ� �Ǹ� ������ ����
		rs=pstmt.executeQuery();	 
*/

package kr.or.ddit.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcTest04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc06", "java");
			System.out.println("�߰� �� LPROD ������ �Է��ϼ���");
			
			System.out.print("LPROD ID�� =");
			int id = s.nextInt();
			
			System.out.println("LPROD GU�� =");
			String gu = s.next();
			
			System.out.println("LPROD NM�� =");
			String nm = s.next();

//		    	Statement������ ó��
//			String sql = "insert into lprod(lprod_id,lprod_gu,lprod_nm)" + "values(" + id + ",'" + gu + "','" + nm+ "')";
//			stmt = conn.createStatement();
			
			
			//Prepared ��ü ���
			
			String sql = "insert into lprod(lprod_id,lprod_gu,lprod_nm)" +
			             "values(?,?,?)";
             pstmt = conn.prepareStatement(sql);
             pstmt.setInt(1,id);
             pstmt.setString(2,gu);
             pstmt.setString(3,nm);
             int cnt = pstmt.executeUpdate(sql);
             
			// ���� ���� �����ҋ��� executequery() �޼��� ���
			// Selcet ���� �ƴ� SQL ���� �����ҋ��� executeUpdate() �޼��� ���
			// ��ȯ�� = �۾��� ������ ���ڵ� ��
			System.out.println("��ȯ�� cnt = "+cnt);} 
		catch (Exception e) {e.printStackTrace();} 
		finally {
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}

		}

	}

}
