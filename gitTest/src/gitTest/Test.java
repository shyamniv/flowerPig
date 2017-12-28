package gitTest;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		System.out.println("아조씨 몇살?");
		int aa = sr.nextInt();

		
		if(aa >= 25) {
			System.out.println("십아재");
		}else {
			System.out.println("애기");
		}


	}
}
 