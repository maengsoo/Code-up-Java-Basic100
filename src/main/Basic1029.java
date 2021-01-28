package main;

import java.util.Scanner;

public class Basic1029 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		double num = sc.nextDouble();
		sc.close();
		
		System.out.printf("%.11f",num);
	}
}