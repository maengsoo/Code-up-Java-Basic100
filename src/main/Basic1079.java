package main;

import java.util.Scanner;

public class Basic1079 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String a = sc.next();
			if (a.equals("q")) {
				System.out.println(a);
				break;
			}
			System.out.println(a);
		}
		sc.close();
	}
}