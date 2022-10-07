package 추상클래스인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppleComputer apple = new  AppleComputer();
		BananaComputer banana = new BananaComputer();
		
		apple.꺼진다();
		apple.인터넷사용한다();
		apple.켜진다();
		banana.꺼진다();
		banana.인터넷사용한다();
		banana.켜진다();
	}

}
