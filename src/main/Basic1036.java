package main;

import java.util.Scanner;

public class Basic1036 {

	public static void main(String[] args) {
		
		// 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		char eng = sc.nextLine().charAt(0);
		sc.close();
		
		System.out.println((int)eng);
	}
}