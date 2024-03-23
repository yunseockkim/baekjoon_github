package level02;

import java.util.*;

public class ex03 {

	public static void main(String[] args) {
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		year = sc.nextInt();
		
		if((year%4 == 0 && year%100 !=0) || year%400 == 0 ) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		

	}

}
