package 생성자;

public class MaskUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mask m = new Mask("검정색", 2, 2000);
		m.color = "흰색";
		m.count = 1;
		m.price =1000;
		
		System.out.println(m);
		
	}

}
