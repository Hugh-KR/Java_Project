package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵 {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();

		map1.put("3334", 1111);
		map1.put("2224", 1112);
		map1.put("1114", 1113);
		map1.put("1234", 1000);

		Set keySet1 = map1.keySet();
		Iterator<String> it1 = keySet1.iterator();
		System.out.println(" key\tvalue");
		while (it1.hasNext()) {
			String key1 = it1.next();
			System.out.print(key1 + "\t");
			System.out.println(map1.get(key1));
		}

	}
}
