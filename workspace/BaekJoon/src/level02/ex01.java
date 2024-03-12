package level02;

import java.util.*;

public class ex01 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}
		else if(a < b) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		

	}

}
