package main;

import java.util.Scanner;

public class Basic1073 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su;
		
		while(true) {
			su = sc.nextInt();
			if(su == 0) break;
			System.out.println(su);
		}
		sc.close();
	}
}