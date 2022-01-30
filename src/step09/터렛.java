package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 터렛 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			
			String[] input = br.readLine().split(" ");
			
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int r1 = Integer.parseInt(input[2]);
			
			int x2 = Integer.parseInt(input[3]);
			int y2 = Integer.parseInt(input[4]);
			int r2 = Integer.parseInt(input[5]);
			
			double distance = (double) Math.sqrt(Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2), 2));
			int max = Math.max(r1, r2);
			int min = Math.min(r1, r2);
			
			if(distance==0) {
				if(r1!=r2) {
					sb.append("0\n");
				}else {
					sb.append("-1\n");
				}
			}else if(distance>max) {
				if(r1+r2<distance) {
					sb.append("0\n");
				}else if(r1+r2==distance) {
					sb.append("1\n");
				}else {
					sb.append("2\n");
				}
			}else if(distance<max||distance==max) {
				if(distance+min==max) {
					sb.append("1\n");
				}else if(distance+min<max) {
					sb.append("0\n");
				}else if(distance+min>max) {
					sb.append("2\n");
				}
			}
		}
		System.out.println(sb);
	}
}
