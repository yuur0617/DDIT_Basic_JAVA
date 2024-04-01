package ddit.chap13.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("ȫ�浿", 28);
		map.put("������", 18);
		map.put("�̼���", 32);
		map.put("������", 13);
		map.put("�۽ÿ�", 22);
		
		//��ȸ
		System.out.println(map.get("�۽ÿ�"));
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> iter = keySet.iterator();

		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
			
		}
	}

}
