package main;

import java.util.Scanner;

public class Basic1074 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count != 0) {
			System.out.println(count);
			count--;
		}
		sc.close();
	}
}