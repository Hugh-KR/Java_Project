package 추상클래스인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 켜진다() {
		// TODO Auto-generated method stub
		System.out.println("애플의 로고와 함께 전원이 켜진다.");
	}

	@Override
	public void 꺼진다() {
		// TODO Auto-generated method stub
		System.out.println("잠자기 기능을 사용하기때문에 안 끄고 사용한다.");
	}

	@Override
	public void 인터넷사용한다() {
		// TODO Auto-generated method stub
		System.out.println("Safari 를 사용한다.");
	}

}
