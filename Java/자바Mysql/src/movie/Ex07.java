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
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
