package 순차문;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.scene.chart.PieChart.Data;

public class 콘솔입력엽습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		System.out.println(name);
		
		
		System.out.print("키 입력 >> ");
		double langth = sc.nextDouble();
		System.out.println(langth);
		
	
		System.out.print("몸무개 입력 >> ");
		double weight = sc.nextDouble();
		System.out.println(weight - 10);
		
		
		System.out.print("저녁을 먹었나요? >>");
		boolean dinner = sc.nextBoolean();
		System.out.println(dinner);
		
		
		System.out.print("나의 좌우명은? >>");
		sc.nextLine();
		String motivation = sc.nextLine();
		System.out.println(motivation);
		
		
		 

	}

}
