package level01;

import java.util.*;

public class ex10 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a*(b%100%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
	}
	
}
