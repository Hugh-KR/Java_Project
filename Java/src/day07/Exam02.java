package day07;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		String n = JOptionPane.showInputDialog("과목 수 입력.");
		int n1 = Integer.parseInt(n);
		
		for (int i=1; i<=n1 ;i++) {
			String p1 = JOptionPane.showInputDialog("과목"+i+"입력.");
			int ip1 = Integer.parseInt(p1);
			sum = sum + ip1;
			
		}
		
		System.out.println(sum/4);
		
		
		double PI = 3.14;
		String radius = JOptionPane.showInputDialog("반지름?");
		double radius1 = Double.parseDouble(radius);
		
		System.out.printf("%.2f",Math.pow(radius1,2)*PI);
	}

}
