package main;

import java.util.Scanner;

public class Basic1034 {

	public static void main(String[] args) {
		
		// 8진수 -> 10진수
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		int num = sc.nextInt(8);
		sc.close();
		
		System.out.printf("%d",num);
	}
}
