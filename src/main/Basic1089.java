package main;

import java.util.Scanner;

public class Basic1089 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int sum   = sc.nextInt();
		int end   = sc.nextInt();
		
		for(int i = 1; i < end; i++) {
			start += sum;
		}
		
		System.out.println(start);
		
		sc.close();
 	}
}