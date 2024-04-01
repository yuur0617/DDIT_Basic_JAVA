package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class UserDao {
	
	private static UserDao instance;
	private UserDao(){}
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public static UserDao getInstance(){
		if(instance == null){
			instance = new UserDao();
		}
		return instance;
	}
	
	public int userSignUp(Map<String, Object> param){	
		
		String sql = "INSERT INTO USERS(USER_ID,PASSWORD,NICKNAME) VALUES (?,?,?)";
		
		List<Object> p = new ArrayList<>();
		p.add(param.get("USER_ID"));
		p.add(param.get("PASSWORD"));
		p.add(param.get("NICKNAME"));
		
		return jdbc.update(sql,p);
		
	}
	
	public Map<String, Object> userSignIn(String userId, String password){	
		String sql = "SELECT *"
				+ " FROM USERS"
				+ " WHERE USER_ID = ?"
				+ " AND PASSWORD = ?";
		List<Object> param = new ArrayList<>();
		param.add(userId);
		param.add(password);
		
	
		return jdbc.selectOne(sql, param);
			
	}
	
	public List<Map<String,Object>> resByDistance(){
		String sql =  "select a.*, nvl(score,0) score, nvl(rv_cnt,0) rv_cnt, nvl(c.cnt,0) pick_cnt"
				       +" from restaurants a, "
						   +" (select res_id , round(avg(grade),1) score, count(*) rv_cnt"
							  +" from review"
							 +" group by res_id) b,"
						   +" (select res_id, count(*) cnt"
							  +" from user_pick"
						     +" group by res_id) c"
					  +" where a.res_id = b.res_id(+)"
					   + " and a.res_id= c.res_id(+)"
				     +" order by distance, score desc";
		List<Map<String,Object>> list = jdbc.selectList(sql);
		
		return list;
	}
	
	public List<Map<String,Object>> resByScore(){
		String sql =  "select a.*, nvl(score,0) score, nvl(rv_cnt,0) rv_cnt, nvl(c.cnt,0) pick_cnt"
			          +" from restaurants a, "
					   +" (select res_id , round(avg(grade),1) score, count(*) rv_cnt"
						  +" from review"
						 +" group by res_id) b,"
					   +" (select res_id, count(*) cnt"
						  +" from user_pick"
					     +" group by res_id) c"
				  +" where a.res_id = b.res_id(+)"
				   + " and a.res_id= c.res_id(+)"
				  +" order by score desc, rv_cnt desc";
				     
		List<Map<String,Object>> list = jdbc.selectList(sql);
		
		return list;
	}
	
	public List<Map<String,Object>> resByRvcnt(){
		String sql =  "select a.*, nvl(score,0) score, nvl(rv_cnt,0) rv_cnt, nvl(c.cnt,0) pick_cnt"
		          +" from restaurants a, "
				   +" (select res_id , round(avg(grade),1) score, count(*) rv_cnt"
					  +" from review"
					 +" group by res_id) b,"
				   +" (select res_id, count(*) cnt"
					  +" from user_pick"
				     +" group by res_id) c"
			  +" where a.res_id = b.res_id(+)"
			   + " and a.res_id= c.res_id(+)"
			  +" order by rv_cnt desc, score desc";
		List<Map<String,Object>> list = jdbc.selectList(sql);
		
		return list;
	}
	
	public List<Map<String,Object>> resByName(String name){
		String sql =  "select a.*, nvl(score,0) score, nvl(rv_cnt,0) rv_cnt, nvl(c.cnt,0) pick_cnt"
		          +" from restaurants a, "
				   +" (select res_id , round(avg(grade),1) score, count(*) rv_cnt"
					  +" from review"
					 +" group by res_id) b,"
				   +" (select res_id, count(*) cnt"
					  +" from user_pick"
				     +" group by res_id) c"
			  +" where a.res_id = b.res_id(+)"
			   + " and a.res_id= c.res_id(+)"
			    +" and res_name like ?"
			  +" order by rv_cnt desc";
		List<Object> p = new ArrayList<>();
		p.add("%"+name+"%");	// %�� ������ String sql �� ���� ������ ���ϴ�. �ƿ� �Ķ���ͷ� ������ �մϴ�.
		List<Map<String,Object>> list = jdbc.selectList(sql,p);
		
		return list;
	}
	
	public boolean isIdExist(String id){		// �Է��� ���̵� �̹� �����ϴ��� Ȯ���ϴ� �����Դϴ�.
		String sql = "select count(user_id) cnt from users where user_id=?";
		List<Object> p = new ArrayList<>();
		p.add(id);
		if(jdbc.selectOne(sql, p).get("CNT").toString().equals("1"))
			return true;
		else return false;
		
	}
	
	public boolean isNicknameExist(String nickname){		// �Է��� �г����� �̹� �����ϴ��� Ȯ���ϴ� �����Դϴ�.
		String sql = "select count(nickname) cnt from users where nickname=?";
		List<Object> p = new ArrayList<>();
		p.add(nickname);
		if(jdbc.selectOne(sql, p).get("CNT").toString().equals("1"))
			return true;
		else return false;
		
	}
	
	public Map<String,Object> resDetail(String resId){
		String sql =  "select a.*, nvl(score,0) score, nvl(rv_cnt,0) rv_cnt, nvl(c.cnt,0) pick_cnt"
		          +" from restaurants a, "
				   +" (select res_id , round(avg(grade),2) score, count(*) rv_cnt"
					  +" from review"
					 +" group by res_id) b,"
				   +" (select res_id, count(*) cnt"
					  +" from user_pick"
				     +" group by res_id) c"
			  +" where a.res_id = b.res_id(+)"
			   + " and a.res_id= c.res_id(+)"
			    +" and a.res_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		return jdbc.selectOne(sql, p);
		
	}
	
	public boolean isPick(String resId, String userId){	//�Ĵ� ������ Ȯ���ؼ� �� ���θ� boolean���� ����
		String sql = "select count(*) cnt from user_pick"
				     +" where res_id = ? and user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		p.add(userId);
		String isPick = jdbc.selectOne(sql, p).get("CNT").toString();
		
		if(isPick.equals("1")) return true;
		else return false;
	}
	
	public int resPick(String resId, String userId){	//�Ĵ� ���ϱ�
		String sql = "insert into user_pick(res_id,user_id) values(?,?)";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		p.add(userId);
		return jdbc.update(sql, p);
	}
	
	public int resUnPick(String resId, String userId){	//�Ĵ� ���Ѱ� ����ϱ�
		String sql = "delete from user_pick where res_id=? and user_id=?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		p.add(userId);
		return jdbc.update(sql, p);
	}
	
	public List<Map<String,Object>> pickList(String userId){	//���� ����Ʈ �޾ƿ���
		String sql = "select b.res_name, b.res_id, nvl(round(avg(c.grade),2),0) as score"
				    + " from user_pick a, restaurants b, review c"
			    	+ " where a.user_id = ? and a.res_id = b.res_id and b.res_id = c.res_id(+)"
				 + " group by b.res_name, b.res_id"
				 + " order by b.res_name";
		List<Object> p = new ArrayList<>();
		p.add(userId);
		return jdbc.selectList(sql, p);
		
	}
	
	public List<Map<String,Object>> reviewList(String resId){
		String sql = "select r_content,EXTRACT(month from re_date)||'/'"
				+ "||EXTRACT(day from re_date) yymm ,re_no,grade,b.user_id,b.nickname"
				+" from review a,users b where res_id = ? and a.user_id=b.user_id"
				+ " order by re_no desc";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		return jdbc.selectList(sql,p);
	}
	
	public boolean isReviewExist(String userId, String resId){
		String sql = "select count(*) cnt from review where res_id = ? and user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		p.add(userId);
		Map<String,Object> map = jdbc.selectOne(sql,p);
		int check = Integer.parseInt(map.get("CNT").toString());
		if(check>0) return true;
		else return false;
	}
	
	public int delReview(String resId, String userId){	//���� ����
		String sql = "delete from review"
					+" where res_id = ? and user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		p.add(userId);
		return jdbc.update(sql, p);
	}
	
	public String resIdToName(String resId){
		String sql = "select res_name from restaurants where res_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		Map<String, Object> map = jdbc.selectOne(sql,p);
		return map.get("RES_NAME").toString();
	}
	
	public Map<String, Object> getReview(String resId, String userId){
		String sql = "select * from review"
				    +" where res_id = ? and USER_ID = ?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		p.add(userId);
		return jdbc.selectOne(sql,p);
	}
	
	public int newReview(Map<String, Object> map){
		String resId = map.get("resId").toString();
		String userId = map.get("userId").toString();
		String content = map.get("content").toString();
		String grade = map.get("grade").toString();
		String sql = "insert into review(re_no,res_id,user_id,r_content,grade,re_date)"
                +" values((select nvl(max(re_no),0)+1 from review),?,?,?,?,sysdate)";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		p.add(userId);
		p.add(content);
		p.add(grade);
		return jdbc.update(sql,p);
	}
	
	public List<Map<String, Object>> myReview(String userId){
		String sql = "select a.*, b.res_name from review a,restaurants b"
					+" where USER_ID = ? and a.res_id = b.res_id order by re_no";		
		List<Object> p = new ArrayList<>();
		p.add(userId);
		return jdbc.selectList(sql, p);
		
	}
	
	public List<Map<String, Object>> viewMenu(String resId){
		String sql = "select res_id, food, to_char(price,'999,999') as price from menu where res_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(resId);
		return jdbc.selectList(sql,p);
	}
	
	public boolean isDetailedAccount(String userId){
		String sql = "select name from users where user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(userId);
		Map<String, Object> result = jdbc.selectOne(sql,p);
		if(result.get("NAME") == null)
			return false;
		else return true;
	}
	
	public int putDetail(String userId, String name, String phone){
		String sql = "update users set name=?,money=0,phone=?"
				+" where user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(name);
		p.add(phone);
		p.add(userId);
		return jdbc.update(sql, p);
	}
	
	public boolean isPhoneExist(String phone){
		String sql = "select count(*) cnt from users where phone = ?";
		List<Object> p = new ArrayList<>();
		p.add(phone);
		Map<String, Object> result = jdbc.selectOne(sql,p);
		return !result.get("CNT").toString().equals("0");
	}
	
	public List<Map<String,Object>> resByCousine(String cousine){
		String sql =  "select a.*, nvl(score,0) score, nvl(rv_cnt,0) rv_cnt, nvl(c.cnt,0) pick_cnt"
		          +" from restaurants a, "
				   +" (select res_id , round(avg(grade),1) score, count(*) rv_cnt"
					  +" from review"
					 +" group by res_id) b,"
				   +" (select res_id, count(*) cnt"
					  +" from user_pick"
				     +" group by res_id) c"
			  +" where a.res_id = b.res_id(+)"
			   + " and a.res_id= c.res_id(+)"
			    +" and cousine like ?"
			  +" order by score desc";
		List<Object> p = new ArrayList<>();
		p.add(cousine);
		return jdbc.selectList(sql, p);
	}
	
	public List<Map<String, Object>> searchByMenu(String menu){
		String sql = "select distinct a.*, nvl(c.score,0) score, nvl(c.rv_cnt,0) rv_cnt, "
					+" nvl(d.pick_cnt,0) pick_cnt from RESTAURANTS a, menu b, (select res_id , " 
                    +" round(avg(grade),1) score, count(*) rv_cnt from review"
				    +" group by res_id) c, (select res_id, count(*) pick_cnt from user_pick group by res_id) d"
				    +" where a.RES_ID=b.RES_ID and a.RES_ID=c.RES_ID(+) and a.RES_ID=d.RES_ID(+)"
				    +" and FOOD like ? order by score desc";
		List<Object> p = new ArrayList<>();
		String str = "%"+menu+"%";
		p.add(str);
		return jdbc.selectList(sql, p);
	}
	
	public boolean isIdPassOk(String userId, String password){
		String sql = "select count(*) cnt from users where user_id = ? and password = ?";
		List<Object> p = new ArrayList<>();
		p.add(userId);
		p.add(password);
		return jdbc.selectOne(sql, p).get("CNT").toString().equals("1");
		
	}
	
	public List<Map<String, Object>> myOrder(String userId){
		String sql = "select * from box_order where user_id = ? order by order_date desc";
		List<Object> p = new ArrayList<>();
		p.add(userId);
		
		return jdbc.selectList(sql, p);
	}
	
	public boolean updateNickname(String userId, String nickname){
		String sql = "update users set nickname = ? where user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(nickname);
		p.add(userId);
		return 1==jdbc.update(sql, p);
	}
	
	public boolean updatePhone(String userId, String phone){
		String sql = "update users set phone = ? where user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(phone);
		p.add(userId);
		return 1==jdbc.update(sql, p);
	}
	
	public boolean updatePassword(String userId, String password){
		String sql = "update users set password = ? where user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(password);
		p.add(userId);
		return 1==jdbc.update(sql, p);
	}
	
	public String getPass(String userId){
		String sql = "select password from users where user_id = ?";
		List<Object> p = new ArrayList<>();
		p.add(userId);
		return jdbc.selectOne(sql, p).get("PASSWORD").toString();
	}

}