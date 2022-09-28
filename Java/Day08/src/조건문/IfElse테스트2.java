package 조건문;

public class IfElse테스트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu = 88;
		String result = "";
		
		if (jumsu >= 90) {
			result = "A학점";
		}else if (jumsu >= 85 && jumsu < 90) {
			result = "B학점";
		}else if (jumsu >= 80 && jumsu < 85) {
			result = "C학점";
		}else {
			result = "D학점";
		}
		
		System.out.println(result);

	}

}
