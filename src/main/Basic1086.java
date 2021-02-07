package main;

import java.util.Scanner;

public class Basic1086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		float f = (float)(((a * b * c) / 8) / 1024) / 1024;
		
		System.out.printf("%.2f MB",f);
		
		sc.close();
 	}
}