package main;

import java.util.Scanner;

public class Basic1025 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int ans[] = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			ans[i] = str.charAt(i)-'0';
		}
		
		System.out.println("["+ans[0]*10000+"]");
		System.out.println("["+ans[1]*1000+"]");
		System.out.println("["+ans[2]*100+"]");
		System.out.println("["+ans[3]*10+"]");
		System.out.println("["+ans[4]+"]");
		
		sc.close();
		
	}

}