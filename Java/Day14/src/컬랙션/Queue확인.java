package 컬랙션;

import java.util.LinkedList;

public class Queue확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> sub = new LinkedList<String>();
		sub.add("국어");
		sub.add("수학");
		sub.add("영어");
		sub.add("컴퓨터");
		
		System.out.println("전체 시험볼 과목: " + sub);
		System.out.println();
		for (int i = 0; i <= sub.size(); i++) {
			sub.remove();
			System.out.println("1일자: 시험본 후 남은 과목: " + sub);
		}
		
		
	}

}
