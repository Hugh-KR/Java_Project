package 추상클래스인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 켜진다() {
		// TODO Auto-generated method stub
		System.out.println("윈도우 로고와 함께 전원이 켜진다.");
	}

	@Override
	public void 꺼진다() {
		// TODO Auto-generated method stub
		System.out.println("종료버튼을 누르고 종료한다.");
	}

	@Override
	public void 인터넷사용한다() {
		// TODO Auto-generated method stub
		System.out.println("Edge 브라우저를 사용한다.");
	}

}
