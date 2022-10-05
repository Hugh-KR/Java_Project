package 정적;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동", 25, '여');
		직원 work2 = new 직원("김길동", 24, '남');
		직원 work3 = new 직원("송길동", 26, '여');
		
		System.out.println("우리 회사의 직원수는? " + work3.count + "명.");
		System.out.println("---------------------");
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println();
		System.out.println("우리 회사 직원의 평균 나이. " + work3.totalAge / work2.count);
		
	}

}
