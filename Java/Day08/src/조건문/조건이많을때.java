package 조건문;

import java.util.Date;

public class 조건이많을때 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();
		System.out.println(day);
		
		switch (day) {
		case 0: case 6:
			System.out.println("자바공부하러가기");
			break;

		default:
			break;
		}
		
	}

}
