package step08;

import java.util.Scanner;

public class 설탕배달 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int min = N;
		
		for(int i=0;i<=N/5;i++) {
			for(int j=0;j<=N/3;j++) {
				if(5*i+3*j==N) {
					min = Math.min(min, i+j);
				}
			}
		}
		
		if(min==N)
			min=-1;
		
		System.out.println(min);
	}
}
