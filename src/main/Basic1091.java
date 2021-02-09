package main;

import java.util.Scanner;

public class Basic1091 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long start 		   = sc.nextLong();
		int	multiplication = sc.nextInt();
		int sum			   = sc.nextInt();
		int turn 		   = sc.nextInt();
		
		for(int i = 1; i<turn; i++) {
			start *= multiplication;
			start += sum;
		}
		
		System.out.println(start);
		
		sc.close();
 	}
}