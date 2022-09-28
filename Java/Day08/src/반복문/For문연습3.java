package 반복문;

public class For문연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1;i<=1000;i=i+3) {
			if (sum>=100) {
				break;
			}else if (i%5==0) {
				continue;
			}
			sum = sum + i;
			
		}
		System.out.println(sum);
	
	}

}
