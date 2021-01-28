package main;

import java.util.Scanner;

public class Basic1024 {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] a = str.split("");
		
		System.out.println("'"+a[0]+"'");
		System.out.println("'"+a[1]+"'");
		System.out.println("'"+a[2]+"'");
		
		sc.close();
	*/
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		//char list 선언
		char list[] = new char[str.length()];
		
		//list에 인덱싱
		for(int i = 0; i < str.length(); i++) {
			list[i] = str.charAt(i);
		}
		
		for(char i:list) {
			System.out.println("'"+i+"'");
		}
		
	}

}