package main;

import java.util.Scanner;

public class Basic1012 {

	public static void main(String[] args) {
		//소수점 자리 변환
		float n ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextFloat();
		
		String n6 = String.format("%.6f", n);
		
		System.out.println(n6);
	
		sc.close();
	}

}