package main;

import java.util.Scanner;

public class Basic1061 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
//		** 비트단위(bitwise) 연산자는,
//		~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
//		<<(bitwise left shift), >>(bitwise right shift)
		
		System.out.println(a|b);
	}
}