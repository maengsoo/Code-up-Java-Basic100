package main;

import java.util.Scanner;

public class Basic1076 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char start = 'a';
		char alpha = sc.next().charAt(0);
		
		do {
			System.out.println(start);
			start += 1;
		} while (start <= alpha);
		
		sc.close();
	}
}