package step09;

import java.util.Scanner;

public class 소수찾기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			int j=2;
			while(j<num) {
				if(num%j==0) {
					break;
				}
				j++;
			}
			if(j==num) {
				count++;
			}
		}

	}

}
