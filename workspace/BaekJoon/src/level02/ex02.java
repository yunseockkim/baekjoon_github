package level02;

import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
