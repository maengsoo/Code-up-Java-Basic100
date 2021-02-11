package main;

import java.util.Scanner;

public class Basic1098 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int h,w,n,l,d,x,y;
	
	//h = height, w = width
	h = sc.nextInt();
	w = sc.nextInt();
	
	int[][] arr = new int[h][w];

	n = sc.nextInt();
	
	//l = length, d = direction
	for(int i = 0; i < n; i++) {
		l = sc.nextInt();
		d = sc.nextInt();
		x = sc.nextInt()-1;
		y = sc.nextInt()-1;
		
		//가로방향
		if(d == 0) {
			for(int k = 0; k < l; k++) {
				arr[x][k+y] = 1;
			}
		}
		
		//세로방향
		if(d == 1) {
			for(int k = 0; k < l; k++) {
				arr[k+x][y] = 1;
			}
		}
	}
	
	for(int i = 0; i < h; i++) {
		for(int k = 0; k < w; k++) {
			System.out.print(arr[i][k]+" ");
		}
		System.out.println();
	}
	sc.close();
		
 	}
}