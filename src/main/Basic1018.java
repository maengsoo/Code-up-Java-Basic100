package main;

import java.util.Scanner;

public class Basic1018 {

	public static void main(String[] args) {
		
		//형식에 맞춰 그대로 출력
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] args1 = str.split(":");
		String h = args1[0];
		String m = args1[1];
		
		System.out.printf("%s:%s", h, m);
	
		sc.close();
	}

}