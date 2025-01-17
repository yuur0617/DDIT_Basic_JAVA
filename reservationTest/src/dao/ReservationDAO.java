package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class ReservationDAO {
	private static ReservationDAO instance = null;
	private ReservationDAO() {}
	public static ReservationDAO getInstance() {
		if(instance == null) instance = new ReservationDAO();
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> list(int num){
		String sql = "SELECT * FROM SEAT WHERE SEAT_RNO = ?";	// 쿼리를 만들어준다
		List<Object> param = new ArrayList<Object>();
		param.add(num);
		return jdbc.selectList(sql);
	}
	public List<Map<String, Object>> list() {
		return jdbc.selectList("SELECT * FROM SEAT WHERE SEAT_RNO = '101'");
	}
	
//	public int update(String sql) {
//		List<Object> param = new ArrayList<Object>();
//		
//		return jdbc.update(sql);
//	}
}







