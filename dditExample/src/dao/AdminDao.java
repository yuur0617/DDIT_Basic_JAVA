package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class AdminDao {
	
	private static AdminDao instance;
	private AdminDao(){}
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public static AdminDao getInstance(){
		if(instance == null){
			instance = new AdminDao();
		}
		return instance;
	}
	
	public int resAdd(Map<String, Object> param){	//�Ϸ� BUT �׽�Ʈ �ʿ�
		String sql = "insert into RESTAURANTS(RES_ID,RES_NAME,COUSINE,OPEN_TIME,CLOSE_TIME,ADD1,DISTANCE)"
                +"values((select nvl(max(RES_ID),0)+1 from RESTAURANTS)"
				+",?,?,?,?,?,?)";
		
		List<Object> p = new ArrayList<>();
		p.add(param.get("RES_NAME"));
		p.add(param.get("COUSINE"));
		p.add(param.get("OPEN_TIME"));
		p.add(param.get("CLOSE_TIME"));
		p.add(param.get("ADD1"));
		p.add(param.get("DISTANCE"));
		
		return jdbc.update(sql,p);
	}
	
	public String resIdToName(String resId){
		String sql = "select res_name from restaurants where res_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		Map<String, Object> map = jdbc.selectOne(sql,p);
		return map.get("RES_NAME").toString();
	}
	
	public int menuAdd(String resId, String food, int price){
		String sql = "insert into menu(res_id, food, price) values(?,?,?)";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		p.add(food);
		p.add(price);
		return jdbc.update(sql,p);
	}
	
	public boolean loadCredit(String userId, int money){
		String sql = "update users set money = money +?"
					+" where  user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(money);
		p.add(userId);
		
		return 1 == jdbc.update(sql, p);
		
	}
	
	public List<Map<String,Object>> boxOrderList(){
		String sql = "select name,phone,price,box_name"
					+" from box_order a, users b"
					+" where to_date(order_date) = to_date(sysdate)"
					+" and a.user_id = b.user_id";
		return jdbc.selectList(sql);
	}

	
}