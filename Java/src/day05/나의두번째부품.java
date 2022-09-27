package day05;
//부품의 위치를 알려주는 
import javax.swing.JOptionPane;

public class 나의두번째부품 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		String habbit = JOptionPane.showInputDialog("당신의 취미를 입력하세요.");
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		
//		취미, 이름 입력 ==> 출
		
		JOptionPane.showMessageDialog(null , "나의 나이는 " + age);
		JOptionPane.showMessageDialog(null, "나의 취미는 "+ habbit);
		JOptionPane.showMessageDialog(null, "나의 나이는 " + name);
	}

}
