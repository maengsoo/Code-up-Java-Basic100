package main;

import java.util.Scanner;

public class Basic1088 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		
		for(int i = 1; i <= su; i++) {
			if(i%3 == 0) continue;
			System.out.print(i+" ");
		}
		
		sc.close();
 	}
}