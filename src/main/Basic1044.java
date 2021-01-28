package main;

import java.util.Scanner;

public class Basic1044 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		long su = sc.nextInt(); // int형 범위로 값받기 -2147483648 ~ 2147483647
		sc.close();// 객체 종료
		
		su++;
		
		System.out.println(su);
	}
}