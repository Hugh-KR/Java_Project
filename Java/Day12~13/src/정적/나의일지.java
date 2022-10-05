package 정적;

public class 나의일지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Day day1 = new Day("자바공부", 10, "강남역");
			System.out.println(day1);
			System.out.println(day1.count);
			System.out.println(day1.totalTime);
			Day day2 = new Day("집가기", 2, "울산");
			System.out.println(day2);
			System.out.println(day2.count);
			System.out.println(day2.totalTime);
			Day day3 = new Day("일하기", 9, "롯데호텔");
			System.out.println(day3);
			System.out.println(day3.count);
			System.out.println("전체 하는 일의 시간 " + day3.totalTime);
			System.out.println("평균하는일의시간 " + day3.totalTime / day3.count);
			
	}

}
