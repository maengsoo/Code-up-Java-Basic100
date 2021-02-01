package main;

import java.util.Scanner;

public class Basic1077 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int alpha = sc.nextInt();
		
		do {
			System.out.println(start);
			start += 1;
		} while (start <= alpha);
		
		sc.close();
	}
}