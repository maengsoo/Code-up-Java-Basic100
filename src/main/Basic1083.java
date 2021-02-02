package main;

import java.util.Scanner;

public class Basic1083 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i%3 != 0) System.out.print(i+" ");
			if(i%3 == 0) System.out.print("X ");
		}
		sc.close();
 	}
}