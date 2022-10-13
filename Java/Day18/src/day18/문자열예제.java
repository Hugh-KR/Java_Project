package day18;

public class 문자열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefg이지스123나";		
		System.out.println("문자열 길이 " + s.length());
		System.out.println("문자열 길이 " + s.getBytes().length);
		System.out.println("문자열 안에 특정 문자를 꺼내는 메소드 " + s.charAt(1));
		System.out.println(s.substring(3));
		System.out.println(s.substring(2,4));
		System.out.println(s.indexOf("c"));
		System.out.println(s.lastIndexOf("c"));
	}

}
