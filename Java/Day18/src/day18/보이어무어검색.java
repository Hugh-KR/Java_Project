package day18;

public class 보이어무어검색 {

	public static void main(String[] args) {
		String txt = "ABABCDEFGHA";
		String pat = "CDE";
		System.out.println((int)Character.MAX_VALUE);
		int idx = bmMatch(txt,pat);
		
		if(idx == -1) System.out.println("그 값의 요소가 없습니다");
		else System.out.println("그 값은 x[" + idx + "]에 있습니다.");

	}

	private static int bmMatch(String txt, String pat) {
		// TODO Auto-generated method stub
		int pt;
		int pp;
		int txtLen = txt.length();
		int patLen = pat.length();
		int[] skip = new int[Character.MAX_VALUE + 1];
		for(pt=0;pt<=Character.MAX_VALUE;pt++) {
			skip[pt] = patLen;
		}
		for(pt=0;pt<=patLen-1;pt++) {
			skip[pat.charAt(pt)] = patLen - pt - 1;
		}
//		for(pt=0;pt<=Character.MAX_VALUE;pt++) {
//			System.out.println(skip[pt] + " ");
//		}
		
		while(pt < txtLen) {
			pp = patLen - 1;
			while(txt.charAt(pt) == pat.charAt(pp)) {
				if(pp==0)
					return pt;
				pp--;
				pt--;
			}
			pt += ( skip[txt.charAt(pt)] > patLen - pp ) ? skip[txt.charAt(pt)] : patLen - pp;
		}
		return 0;
	}
	
	

}
