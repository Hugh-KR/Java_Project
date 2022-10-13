package day18;

public class IdTester119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Id a = new Id();
		Id b = new Id();
		a.getId();
		b.getId();
		
	}

}

class Id{
	private static int counter=0;
	private int id;
	
	public Id() {
		id = ++counter;
		System.out.println(" 생성자 부분임 ");
	}
	public static int getCounter() { return counter;}
	public int getId() {return id;};
	{
		System.out.println("블록 부분임");
	}
	
	static {
		System.out.println("이곳은 정적 블록");
	}
}
