package day07;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "root";
		String q = "pw";
		
		String p1 = JOptionPane.showInputDialog("아이디 입력:");
		String q1 = JOptionPane.showInputDialog("비밀번호 입력:");
		
		if ((p1.equals(p)) && (q1.equals(q))){
			System.out.println("PASS!");
		}else {
			System.out.println("재입력!");
		}
		
		String weight = JOptionPane.showInputDialog("몸무개 변화는?");
		double weight1 = Double.parseDouble(weight);
		
		if (weight1>2) {
			System.out.println("다이어트 성공!");
			}
		
		if ((p1.equals(p)) && (q1.equals(q)) && (weight1>2)) {
			System.out.println("오늘은 성공!");
		
		}else {
			System.out.println("내일 다시 도전!");
		}
		
	}

}
