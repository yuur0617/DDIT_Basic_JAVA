/* PreparedStatement 객체를 이용할 때 SQL 데이터가 들어갈 자리를 물음표로 표시해서 작성한다
		String sql = "select * from lprod where lprod_id between "+?+" and "+?;
	PreparedStatement 객체 생성
		psmt = conn.preparedStatement(쿼리문);
	SQL 문 물음표 자리에 들어갈 데이터를 set
	형식 ) PreparedStatement 객체.set자료형이름(물음표 번호,저장할 데이터)
		String sql = "select * from lprod where lprod_id between "+?+" and "+?;
		pstmt.setInt(1,num1)
		pstmt.setInt(2,num2)
	데이터 셋팅 완료 되면 쿼리문 실행
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
			System.out.println("추가 할 LPROD 정보를 입력하세요");
			
			System.out.print("LPROD ID값 =");
			int id = s.nextInt();
			
			System.out.println("LPROD GU값 =");
			String gu = s.next();
			
			System.out.println("LPROD NM값 =");
			String nm = s.next();

//		    	Statement문으로 처리
//			String sql = "insert into lprod(lprod_id,lprod_gu,lprod_nm)" + "values(" + id + ",'" + gu + "','" + nm+ "')";
//			stmt = conn.createStatement();
			
			
			//Prepared 객체 사용
			
			String sql = "insert into lprod(lprod_id,lprod_gu,lprod_nm)" +
			             "values(?,?,?)";
             pstmt = conn.prepareStatement(sql);
             pstmt.setInt(1,id);
             pstmt.setString(2,gu);
             pstmt.setString(3,nm);
             int cnt = pstmt.executeUpdate(sql);
             
			// 셀렉 문을 실행할떄는 executequery() 메서드 사용
			// Selcet 문이 아닌 SQL 문을 실행할떄는 executeUpdate() 메서드 사용
			// 반환값 = 작업에 성공한 레코드 수
			System.out.println("반환값 cnt = "+cnt);} 
		catch (Exception e) {e.printStackTrace();} 
		finally {
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}

		}

	}

}
