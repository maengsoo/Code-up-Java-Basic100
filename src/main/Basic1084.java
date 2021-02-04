package main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Basic1084 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int red   = sc.nextInt();
		int green = sc.nextInt();
		int blue  = sc.nextInt();
		int count = 0;
		
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
			
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < green; j++) {
				for(int k = 0; k < blue; k++) {
					bw.write(i + " " + j + " " + k + "\n");
					count++;
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		sc.close();
 	}
}