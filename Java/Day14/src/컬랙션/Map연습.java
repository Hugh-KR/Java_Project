package 컬랙션;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map연습 {

	public static void main(String[] args) {
		// 순서를 보장하지 않는다.
		HashMap dic = new HashMap();
		dic.put(100,"김데이");
		dic.put(200,"김사전");
		dic.put(300,"김구조");
		dic.put(400,"김자료");
		
		dic.remove(200);
		System.out.println(dic);
		dic.replace(300,"김충성"); 
		System.out.println(dic);
		
		// 순서를 지키며 출력.
		LinkedHashMap dic1 = new LinkedHashMap();
		dic1.put(100,"김데이");
		dic1.put(200,"김사전");
		dic1.put(300,"김구조");
		dic1.put(400,"김자료");
		
		dic1.remove(200);
		System.out.println(dic1);
		dic1.replace(300,"김충성"); 
		System.out.println(dic1);
		
		
	}

}
