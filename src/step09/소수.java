package step09;

import java.util.Scanner;

public class 소수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = N;
		int sum = 0;
		
		for(int i=M;i<=N;i++) {
			int j=2;
			while(j<i) {
				if(i%j==0) {
					break;
				}
				j++;
			}
//			if()
			
		}

	}

}
