package day18;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdId = new Scanner(System.in);
		
		String[] x = { "boolean", 	"byte", "char", "double", "floatint",
			      "long","short"  };
		System.out.println("찾고 싶은 글자는?");
		String key = stdId.next();
		
		Arrays.binarySearch(x, key);
		
	}

}
