package main;

import java.util.Scanner;

public class Basic1031 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		int octa = sc.nextInt();
		sc.close();
		
		System.out.printf("%o",octa);
	}
}