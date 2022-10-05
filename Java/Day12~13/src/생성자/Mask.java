package 생성자;

public class Mask {
	// 멤버변수(역할), 전역변수(범위), 인스턴스변수(객체생성후실제)
	String color; // 참조형변수(저장타입)
	int price; // 기본형변수
	int count; // 기본형변수
	
	//멤버변수는 전역변수, 전역변수는 자동초기화가 된다.
	//멤버변수의 원본은 클래스원본영역에 저장
	//멤버변수는 객체생성될 때, 힙 영역에 복사가 된다.
	//객체생성 후, 멤버변수값을 나중에 넣어도 상관없는경우.
	//생성자 만들지 않아도 괜찮
	//
	//생성자가 하나도 없는 경우.
	//자동으로 입력값 없는 생성자를 만들어 준다.
	//묵시적으로 생성자가 만들어진다.
	//기본생성자(default constructor)
//	public Mask() {
//		
//	}

	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
}
