package main;

import java.util.Scanner;

public class Basic1096 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int h,v;
	
	int[][] a = new int[19][19];
	
	for(int i = 0; i < n; i++) {
		h = sc.nextInt();
		v = sc.nextInt();
		a[h-1][v-1] = 1;
	}
	
	for(int x = 0; x < 19; x++) {
		for(int y = 0; y < 19; y++) {
			System.out.print(a[x][y]+" ");
		}
		System.out.println();
	}
	sc.close();
		
 	}
}