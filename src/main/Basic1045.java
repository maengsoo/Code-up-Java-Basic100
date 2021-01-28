package main;

import java.util.Scanner;

public class Basic1045 {

	public static void main(String[] args) {
		
		int[] bucket = new int[5];
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		String su = sc.nextLine();
		sc.close();
		
		String[] cut = su.split(" ");
		
		int n1 = Integer.parseInt(cut[0]);
		int n2 = Integer.parseInt(cut[1]);
		
		bucket[0] = n1 + n2;
		bucket[1] = n1 - n2;
		bucket[2] = n1 * n2;
		bucket[3] = n1 / n2;
		bucket[4] = n1 % n2;
		
		for(int i = 0; i<bucket.length; i++) {
			System.out.println(bucket[i]);
		}
		
		float a = (float)n1 / (float)n2;
		
		System.out.printf("%.2f",a);
		
		
	}
}