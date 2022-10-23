package movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Db{
	
}

class Phone{
	private String name;
	private String no;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public Phone() throws IOException {
		System.out.println("이름");
		name = in.readLine();
		System.out.println("전화번호");
		no = in.readLine();
		
	}
}

public class Ex06 {
	

	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1.등록 2.출력 0.종료: ");
			int s = Integer.parseInt(in.readLine());
			if(s==1) {
				new Phone();
			}
			if(s==2) {
				
			}
			if(s==0) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
