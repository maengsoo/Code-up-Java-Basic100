package main;

import java.util.Scanner;

public class Basic1042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		String su2 = sc.nextLine();
		sc.close();
		
		String[] cut = su2.split(" ");
		int n1 = Integer.parseInt(cut[0]);
		int n2 = Integer.parseInt(cut[1]);
		
		System.out.println(n1 / n2);
	}
}