package main;

import java.util.Scanner;

public class Basic1020 {

	public static void main(String[] args) {
		//주민번호 13자리를 입력받아 -를제거하는 메소드
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("-");
		
		System.out.printf("%s%s", arr[0],arr[1]);
		
		sc.close();
	}

}