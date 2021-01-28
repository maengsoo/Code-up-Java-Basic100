package main;

import java.util.Scanner;

public class Basic1067 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a >= 0) System.out.println("plus");
		if(a < 0)  System.out.println("minus");
		
		if(a%2 == 0) System.out.println("even");
		else System.out.println("odd");
				
	}
}