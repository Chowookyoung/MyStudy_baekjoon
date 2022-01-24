package step08;

import java.util.Scanner;

public class 분수찾기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		
		int N = 1;
		int a = 1;
		
		while(true) {
			int sum=0;
			for(int i =1;i<a;i++) {
				sum+=i;
			}
			N = 1+sum;
			if(X<=N+(a-1)) break;
			a++;
		}
		
		if(a%2==0) {
			System.out.println((1+X-N)+"/"+(a-X+N));
		}else {
			System.out.println((a-X+N)+"/"+(1+X-N));
		}
	}
}
