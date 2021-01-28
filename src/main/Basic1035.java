package main;

import java.util.Scanner;

public class Basic1035 {

	public static void main(String[] args) {
		
		// 16진수 -> 8진수
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		int num = sc.nextInt(16);
		sc.close();
		
		System.out.printf("%o",num);
	}
}