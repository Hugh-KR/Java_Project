package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList me = new ArrayList();
		me.add(1000);
		// 오토박싱 자동형변환
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		int money = (int)me.get(0) + 2000; // 다운케스팅, 오토언박싱.
		double len = (double)me.get(1) + 10; // 다운케스팅
		boolean bol = (boolean)me.get(2);
		char gender = (char)me.get(3);
		
		System.out.println(money);
		System.out.println(len);
		if(bol == false) {
			System.out.println("배고파요.");
		}else {
			System.out.println("배불러요.");
		}
		
		if(gender == '남') {
			System.out.println("주민번호는 1,3이예요.");
		}else {
			System.out.println("주민번호는 2,4이예요.");
		}
		
	}

}
