package main;

import java.util.Scanner;

public class Basic1080 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= su; i++) {
			sum += i;
			if(su <= sum) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}