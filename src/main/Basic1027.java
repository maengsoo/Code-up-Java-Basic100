package main;

import java.util.Scanner;

public class Basic1027 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		String date = sc.nextLine();
		sc.close();
		
		String[] arr = date.split("\\.");	//'.'를 기준으로 분할하여 배열에 저장
		int[] intarr = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			intarr[i] = Integer.parseInt(arr[i]);
		}
		// %d int값을 부호있는 10진수로 출력
		System.out.printf("%02d-%02d-%04d",intarr[2],intarr[1],intarr[0]);

				
	}
}