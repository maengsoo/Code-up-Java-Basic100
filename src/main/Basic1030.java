package main;

import java.util.Scanner;

public class Basic1030 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		//System.out.print("정수 입력 : ");
		long num = sc.nextLong();
		sc.close(); //객체 종료 후 닫기
		
		System.out.println(num);
	}
}