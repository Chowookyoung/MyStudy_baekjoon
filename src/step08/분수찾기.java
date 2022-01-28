package step08;

import java.util.Scanner;

public class 분수찾기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int X = 1;//해당 층의 첫번째 분수의 순번
		int a = 1;//층수
		
		int sum=0;
		while(true) {
			X = 1+sum;
			if(N<=X+(a-1)) break;
			sum+=a;
			a++;
		}
		
		if(a%2==0) {
			System.out.println((1+N-X)+"/"+(a-N+X));
		}else {
			System.out.println((a-N+X)+"/"+(1+N-X));
		}
	}
}
