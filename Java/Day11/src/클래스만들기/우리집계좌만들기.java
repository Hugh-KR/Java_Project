package 클래스만들기;

public class 우리집계좌만들기 {

	public static void main(String[] args) {
		계좌 dad = new 계좌();
		dad.이름 = "홍길동";
		dad.계좌이름 = "튼튼적금";
		dad.금액 = 1000;
		
		계좌 park = new 계좌();
		park.이름 = "박길동";
		park.계좌이름 = "튼튼예금";
		park.금액 = 2000;
		
		계좌 hong = new 계좌();
		hong.이름 = "홍기사";
		hong.계좌이름 = "다음적금";
		hong.금액 = 3000;
		
		dad.입금하다();
		dad.출금하다();
		park.입금하다();
		park.출금하다();
		hong.입금하다();
		hong.출금하다();
		
		

	}

}
