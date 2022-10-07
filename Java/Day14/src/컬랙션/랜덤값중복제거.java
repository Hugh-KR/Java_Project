package 컬랙션;

import java.util.HashSet;
import java.util.Random;

public class 랜덤값중복제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		HashSet lotto = new HashSet();
		while (lotto.size() < 6) {
			lotto.add(r.nextInt(45)+1);
		}
		System.out.println(lotto);
	}

}
