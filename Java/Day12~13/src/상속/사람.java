package 상속;

// extend Object 생략
// 모든클래스는 8개의 메서드를 가지고 시작함.

public class 사람{
	String gender;
	String name;
	
	public void 잠자다() {
		System.out.println("잠자다.");
	}
	
	public void 먹다() {
		System.out.println("먹다.");
	}

	@Override
	public String toString() {
		return "사람 [gender=" + gender + ", name=" + name + "]";
	}
	
	
}
