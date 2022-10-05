package 클래스사용하기;

import 클래스만들기.강아지;
// class의 위치를 지정함.
import 클래스만들기.전화기;

public class 내방프로젝트 {
	public static void main(String[] args) {
		전화기 p1 = new 전화기();
		//p1은 참조형 변수
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.통화하다();
		p1.사진을찍다();
		
		전화기 p2 = new 전화기();
		p2.size = 15;
		p2.speaker = "안녕하세요.";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		p2.통화하다();
		p2.사진을찍다();
		
		강아지 d1 = new 강아지();
		d1.color = "white";
		d1.field = "거실";
		System.out.println(d1.color);
		System.out.println(d1.field);
		d1.꼬리를흔들다();
		d1.짖다();
	}
}
