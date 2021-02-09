package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic1095 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[n];
		int minimumSu = 24;
		
		
		for(int i = 0; i <= num.length-1; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if(minimumSu > num[i]) minimumSu = num[i];
		}
		System.out.println(minimumSu);
		
		bw.close();
		br.close();
		
 	}
}