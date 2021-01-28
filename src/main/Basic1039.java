package main;

import java.util.Scanner;

public class Basic1039 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		String su = sc.nextLine();
		sc.close();
		
		String[] arr = su.split(" ");
		
		Long a = Long.parseLong(arr[0]);
		Long b = Long.parseLong(arr[1]);
		
		long c = a + b;
		
		System.out.println(c);
		
		
	}
}