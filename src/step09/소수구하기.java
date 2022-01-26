package step09;

import java.util.Scanner;

public class 소수구하기 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int i=M;i<=N;i++) {
			int j=2;
			while(j<i) {
				if(i%j==0) {
					break;
				}
				j++;
			}
			if(j==i) {
				sb.append(i+"\n");
			}
			
		}
		System.out.println(sb);
	}
}
