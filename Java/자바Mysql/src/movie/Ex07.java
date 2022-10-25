package movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sp{
	private String spname;
	private int price;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public Sp() throws IOException {
		System.out.print("상품명: ");
		spname = in.readLine();
		System.out.print("가격: ");
		price = Integer.parseInt(in.readLine());
	}
}

class DB1{
	
}
public class Ex07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1. 상품등록 2. 조회 3. 수정 4. 삭제 0.종료");
			int s = Integer.parseInt(in.readLine());
			if(s==1) {
				new Sp();
			}
			if(s==2) {
				
			}
			if(s==3) {
				
			}
			if(s==4) {
				
			}
			if(s==0) {
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
