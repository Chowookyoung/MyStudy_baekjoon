package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 베르트랑공준 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		//베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(bf.readLine());
			if(n==0)
				break;
			int count = 0;
			for(int i=n+1;i<=2*n;i++) {
				int j=2;
				while(j<i) {
					if(i%j==0) {
						break;
					}
					j++;
				}
				if(j==i) {
					count++;
				}
				
			}
			sb.append(count+"\n");
		}
		System.out.println(sb);
	}
}
