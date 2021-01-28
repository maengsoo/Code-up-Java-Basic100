package main;

import java.util.Scanner;

public class Basic1048 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		String su = sc.nextLine();
		sc.close();
		
		String[] arr = su.split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		System.out.printf("%d",a<<b);
		
	}
}