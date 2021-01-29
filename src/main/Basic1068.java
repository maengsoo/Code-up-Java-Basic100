package main;

import java.util.Scanner;

public class Basic1068 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		sc.close();
		
		if(100 >= su && su >= 90) System.out.println("A");
		if( 89 >= su && su >= 70) System.out.println("B");
		if( 69 >= su && su >= 40) System.out.println("C");
		if( 39 >= su && su >=  0) System.out.println("D");
				
	}
}