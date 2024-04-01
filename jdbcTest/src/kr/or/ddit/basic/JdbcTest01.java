package kr.or.ddit.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC(Java DataBase Connectivity) 라이브러리를 이용한 DB자료를 처리하는 예제
public class JdbcTest01 {
/*
	디비처리 순서
1. 드라이버 로딩 ==> 라이브러리를 사용할수있게 메모리로 읽어 들이는 작업
	==>JDBC버전 4.9이상에서는 getConnection() 메서드에서 자동으로 로딩을 해준다.
	       그래서 생략 가능하다. (그렇지만 생략하지 않고 사용할 예정)
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
2. DB시스템에 접속하기 ==> 접속이 완료되면 Connection객체가 반환된다.
	DriverManager.getCOnnection() 메서드를 이용한다.
	
3. 질의 ==> SQL 문장을 DB서버로 보내서 결과를 얻어온다.
	(Statement 객체 또는 PreparedStatement객체를 이용하여 작업한다.)
	
4. 결과 처리 작업
	1) SQL문 select문일 경우에는 select한 결과가 ResultSet객체에 저장되어 반환된다. 
	2) SQL문이 select문이 아닐 경우(insert문, delete문, update문 등)에는
	    정수값이 반환된다. (이 정수 값은 보통 실행에 성공한 레코드 수를 의미한다.)
	    
5. 사용한 자원을 반납한다. ==> 각 객체의 close() 메서드를 이요한다. 
*/
	public static void main(String[] args) {
		//DB 작업에 필요한 변수 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc06", "java");
			
			// 3. 질의
			// 3-1. SQL문 작성
			String sql = "select * from lprod";
			
			// 3-2. Statement객체 생성한다. ==> 질의를 처리하는 객체
			stmt = conn.createStatement();
			
			// 3-3. SQL문을 DB서버로 전송하고 DB서버가 처리한 결과를 얻어온다.
			//		(지금은 실행한 SQL문이 select문이기 때문에 결과가 
			//       ResultSet객체에 저장되어 반환된다.)
			rs = stmt.executeQuery(sql);
			
			// 4. 결과 처리하기 ==> 한 레코드씩 화면에 출력하기
			
			// ResultSet에 저장된 데이터를 차례로 꺼내 오려면 반복문과 next()문을 사용해서 처리한다.
			System.out.println(" == 쿼리문 처리 결과 ==");
			// rs.next() 메서드 ==> rs객체의 데이터를 가리키는 포인터를 다음번째 레코드위치로 
			// 					  이동시키고 그 곳에 데이터가 있으면 true, 그렇지 않으면 false를 반환한다.
			while(rs.next()) {
				// 포인터가 가리키는 곳의 자료를 가져오는 방법
				// 행식1) rs.get자료형이름("컬럼명 또는 Alias명)
				// 형식2) rs.get자료형이름(컬럼번호)  ==> 컬럼번호는 1부터 시작한다.
				System.out.println("LPROD_ID :" + rs.getInt("lprod_id"));
				System.out.println("LPROD_GU :" + rs.getString(2));
				System.out.println("LPROD_NM :" + rs.getNString("LPROD_NM"));
				System.out.println("---------------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. 자원반납
			if(rs != null) try {rs.close(); } catch(SQLException e) {}
			if(stmt != null) try {stmt.close(); } catch(SQLException e) {}
			if(conn != null) try {conn.close(); } catch(SQLException e) {}
		}
	}
}
