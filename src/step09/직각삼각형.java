package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 직각삼각형 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String[] input = br.readLine().split(" ");
			if(input[0].equals("0"))
				break;
			
			int a = (int) Math.pow(Integer.parseInt(input[0]),2);
			int b = (int) Math.pow(Integer.parseInt(input[1]),2);
			int c = (int) Math.pow(Integer.parseInt(input[2]),2);
			
			if(a+b==c||a+c==b||b+c==a) {
				sb.append("right\n");
			}else {
				sb.append("wrong\n");
			}
		}
		System.out.println(sb);
	}
}
