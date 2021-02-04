package main;

import java.util.Scanner;

public class Basic1085 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long h = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long s = sc.nextLong();
		double total = 0;
		
		/*
		 h, b, c, s
		 h: 소리강약을 체크하는 수 (자연수)
		 b: 비트 수 (자연수)
		 s: 녹음 할 시간(정수)
		 CD 음질(44.1KHz, 16bit, 스테레오)로 1초 동안 저장하려면
		 44100 * 16 * 1 bit의 저장공간이 필요
		 */
		
		//비트 연산자 right shift가 2의 제곱의 효
		
		total = h * b * c * s;
		double result = ((total / 8) / Math.pow(2, 10) / Math.pow(2, 10));
		
		System.out.printf("%.1f MB",result);
		
		sc.close();
 	}
}