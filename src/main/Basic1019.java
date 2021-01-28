package main;

import java.util.Scanner;

public class Basic1019 {

	public static void main(String[] args) {
		//split 메소드 안에 기준으로 문자열을 자름.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] args1 = str.split("\\.");

		int [] arr = new int[3];
		
		//문자열 자른거를 인트형으로 변환시켜줌
		for (int i = 0; i<args1.length; i++) {
			arr[i] = Integer.parseInt(args1[i]);
		}
		//형식에 맞게 출력
		System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
		
	
		sc.close();
	}

}