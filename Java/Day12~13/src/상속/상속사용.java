package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "읠리엄";
		sMan.size = 200;
		System.err.println(sMan);
		sMan.날아다니다();
		sMan.달리다();
		sMan.먹다();
		sMan.잠자다();
		
		원더우먼 wWoman = new 원더우먼();
		wWoman.gender = "여자";
		wWoman.name = "세나";
		wWoman.size = 160;
		System.out.println(wWoman);
		wWoman.공격을막는다();
		wWoman.달리다();
		wWoman.먹다();
		wWoman.잠자다();
		
		
	
	}

}
