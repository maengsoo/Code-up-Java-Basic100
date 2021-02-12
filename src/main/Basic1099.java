package main;

import java.util.Scanner;

public class Basic1099 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int [][] antHouse = new int[10][10];
	int flag = 1;
	int end = 0;
	
	//antHouse 입력문
	for(int x = 0; x < 10; x++) {
		for(int y = 0; y < 10; y++) {
			antHouse[x][y] = sc.nextInt();
		}
	}
	
	for(int x = 1; x < antHouse.length; x++) {
		if(end == 0) {
			for(int y = flag; y < antHouse[x].length; y++) {
				
				//0인 상황(길)
				if(antHouse[x][y] == 0) {
					antHouse[x][y] = 9;
					
				}
				//2인 상황(먹이)
				if(antHouse[x][y] == 2) {
					antHouse[x][y] = 9;
					end = 1;
					break;
					
				}
				//1인 상황(막다른 길)
				if(antHouse[x][y+1] == 1) {
					flag = y;
					break;
				}
			}		
		}
		if(end == 1) break;
	}
	//antHouse 출력문
	for(int x = 0; x < 10; x++) {
		for(int y = 0; y < 10; y++) {
			System.out.print(antHouse[x][y]+" ");
		}
		System.out.println();
	}

	
	sc.close();
		
 	}
}