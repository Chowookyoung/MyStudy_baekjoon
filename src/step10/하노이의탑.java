package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이의탑 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		sb.append((int) Math.pow(2, N) - 1).append('\n');
		
		hanoi(N,1,2,3);
		System.out.println(sb);

	}

	public static void hanoi(int N, int s, int m, int f) {
		if(N==1) {
			sb.append(s+" "+f+"\n");
			return;
		}
		hanoi(N-1,s,f,m);
		sb.append(s+" "+f+"\n");
		hanoi(N-1,m,s,f);
	}
}
