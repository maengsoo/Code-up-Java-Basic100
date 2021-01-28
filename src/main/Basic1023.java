package main;

import java.util.Scanner;

public class Basic1023 {

	public static void main(String[] args) {
		
		//소수 1.123123을 입력받아 점 단위로 따로 출력
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] a = str.split("\\.");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		sc.close();
	}

}