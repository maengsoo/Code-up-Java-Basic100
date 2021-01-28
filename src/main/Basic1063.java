package main;

import java.util.Scanner;

public class Basic1063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		
		//삼항 연산자
		// a>b 참(1)이면 a가 출력되고
		// a>b 거짓(0)이면 b가 출력된
		System.out.printf("%d",a>b ?a:b);
	}
}