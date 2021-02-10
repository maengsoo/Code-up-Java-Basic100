package main;

import java.util.Scanner;

public class Basic1097 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int i,j,x,y,n;
	
	int[][] a = new int[19][19];
	
	for(i = 0; i < 19; i++) {
		for(j =0; j < 19; j++) {
			a[i][j] = sc.nextInt();
		}
	}

	n = sc.nextInt();
	
	//if문 두개를 사용하는것과 if else의 차이점을 다시 공부하게 됨
	for(i = 0; i < n; i++) {
		x = sc.nextInt();
		y = sc.nextInt();
		
//		if(a[x-1][y-1] == 0) a[x-1][y-1] = 1;
//		if(a[x-1][y-1] == 1) a[x-1][y-1] = 0;
		  
		for(j =0; j < 19; j++) {
			if(a[x-1][j] == 0) a[x-1][j] = 1;
			else a[x-1][j] = 0;
		}
		for(j =0; j < 19; j++) {
			if(a[j][y-1] == 0) a[j][y-1] = 1;
			else a[j][y-1] = 0;
		}
	}
	
	for(i = 0; i < 19; i++) {
		for(j = 0; j < 19; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}

	sc.close();
		
 	}
}