package main;

import java.util.Scanner;

public class Basic1064 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		//가장 작은 값 출력
		System.out.println((a<b?a:b)<c?(a<b?a:b):c);
	}
}