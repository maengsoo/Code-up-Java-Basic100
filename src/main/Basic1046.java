package main;

import java.util.Scanner;

public class Basic1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		String su = sc.nextLine();
		sc.close();
		
		String[] cut = su.split(" ");
		
		int n1 = Integer.parseInt(cut[0]);
		int n2 = Integer.parseInt(cut[1]);
		int n3 = Integer.parseInt(cut[2]);
		
		int hab = n1 + n2 + n3;
		double avg = (double)hab / 3;
		
		System.out.println(hab);
		System.out.printf("%.1f",avg);
		
		
	}
}