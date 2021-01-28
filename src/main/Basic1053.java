package main;

import java.util.Scanner;

public class Basic1053 {

	public static void main(String[] args) {
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		int su = sc.nextInt();
		sc.close();
		
		if(su == 0) result = 1;
		if(su == 1) result = 0;
		
		System.out.println(result);
		
	}
}