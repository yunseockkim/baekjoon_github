package level01;

import java.util.*;

public class ex09 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		

	}

}
