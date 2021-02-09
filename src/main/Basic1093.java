package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic1093 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[23];
		
		while(n != 0) {
			int temp = Integer.parseInt(st.nextToken());
			num[temp-1]++;
			n--;
		}
		
		for (int i : num) {
			bw.write(i+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
/*		Scanner sc = new Scanner(System.in);
		int n,i,t;
		int[] a = new int[24];
		n = sc.nextInt();
		
		for(i = 1; i<=n; i++) {
		t = sc.nextInt();
			a[t] = a[t] + 1;
		}
		
		for(i = 1; i <= 23; i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
*/
 	}
}