package main;

import java.util.Scanner;

public class Basic1015 {

	public static void main(String[] args) {
		//소수점 자리 변환
		float n ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextFloat();
		//소수점 둘 째 자리에서 반올림
		String n2 = String.format("%.2f", n);
		
		System.out.println(n2);
	
		sc.close();
	}

}