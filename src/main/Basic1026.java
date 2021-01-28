package main;

import java.util.Scanner;

public class Basic1026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		String date = sc.nextLine();
		sc.close();
		
		String[] arr = date.split(":");	//':'를 기준으로 분할하여 배열에 저장
		
		//'printf'는 값을 변환해서 출력 할 수 있
		System.out.printf("%d",Integer.parseInt(arr[1]));
		
//		for(int i = 0; i<arr.length; i++) {
//			String a = arr[i];
//			if(i == 1) { // 입력된 데이터 중 '분'만 출력
//				System.out.println(a);
//			}
//		}
				
	}
}