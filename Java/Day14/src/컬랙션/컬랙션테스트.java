package 컬랙션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬랙션테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("디자이너");
		set.add("프로그래머");
		set.add("DB관리자");
		System.out.println(set);
		
		LinkedList<String> queue = new LinkedList<String>();
		queue.add("상한우유");
		queue.add("싱싱우유");
		System.out.println("제거 >> " + queue.remove());
		System.out.println("남은우유 >> " + queue);
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("박스키");
		array.add("송스키");
		array.add("김스키");
		array.add("정스키");
		
		array.remove(1);
		System.out.println(array);
		
		
	}

}
