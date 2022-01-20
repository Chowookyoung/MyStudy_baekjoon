package step11;

import java.util.Scanner;

public class 영화감독숌 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int n = 666;
		int count = 1;
		
		//����'s Ǯ��
		while(count != N) {
			n++;
			if(String.valueOf(n).contains("666")) {
				count++;
			}
		}
//		while (count<N) {
//			n++;
//			int n2 = n;
//			while(n2>0) {
//				if(n2%1000==666) {
//					count++;
//					break;
//				}
//				n2/=10;
//			}
//		}
		System.out.println(n);

	}

}
