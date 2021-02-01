package main;

import java.util.Scanner;

public class Basic1075 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count != 0) {
			count--;
			System.out.println(count);
		}
		sc.close();
	}
}