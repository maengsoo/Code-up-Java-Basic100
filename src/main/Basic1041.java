package main;

import java.util.Scanner;

public class Basic1041 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		char su = sc.next().charAt(0);
		sc.close();
		
		su += 1;
		System.out.println(su);
		
//		int num = (int)su + 1;
//		char next_su = (char)num;
//		
//		System.out.println(next_su);
	}
}