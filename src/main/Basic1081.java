package main;

import java.util.Scanner;

public class Basic1081 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nm = sc.nextLine();
		
		String[] str = nm.split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		for(int i = 1; i <= n; i++) {
			for(int z = 1; z <= m; z++) {
				System.out.println(i+" "+z);
			}
		}
		sc.close();
 	}
}