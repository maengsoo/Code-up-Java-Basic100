package main;

import java.util.Scanner;

public class Basic1028 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		long num = sc.nextLong();
		sc.close();
		
		//int형의 데이터 범위: -2147483648 ~ 2147483647
    	//long형의 데이터 범위: -9223372036854775808 ~ 9223372036854775807
    	//입력되는 정수의 범위: 0 ~ 4294967295 → long형 선택
		System.out.println(num);
	}
}
