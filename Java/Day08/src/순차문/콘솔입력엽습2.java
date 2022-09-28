package 순차문;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.scene.chart.PieChart.Data;

public class 콘솔입력엽습2 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("이름 입력 >> ");
		String name = sc1.next();
		System.out.println(name);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("키 입력 >> ");
		double langth = sc2.nextDouble();
		System.out.println(langth);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("몸무개 입력 >> ");
		double weight = sc3.nextDouble();
		System.out.println(weight - 10);
		
		Scanner sc4 = new Scanner(System.in);
		System.out.print("저녁을 먹었나요? >>");
		boolean dinner = sc4.nextBoolean();
		System.out.println(dinner);
		
		Scanner sc5 = new Scanner(System.in);
		System.out.print("나의 좌우명은? >>");
		String motivation = sc4.nextLine();
		System.out.println(motivation);
		
		
		

	}

}
