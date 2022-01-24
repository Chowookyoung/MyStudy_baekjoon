package step08;

import java.util.Scanner;

public class 부녀회장이될테야 {

	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // Test case의 수
		
		for(int test=0;test<T;test++) {
			
			int k = sc.nextInt(); // 층의
			int n = sc.nextInt(); // 호에는 몇명이 사는가
			
			int[][] room = new int[k + 1][n];
			
			for (int i = 0; i < k + 1; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0) {
						room[i][j] = j + 1;
					} else {
						int sum = 0;
						for (int m = 0; m <= j; m++) {
							sum += room[i - 1][m];
						}
						room[i][j] = sum;
					}
				}
			}
			
			sb.append(room[k][n-1]+"\n");
		}
		System.out.println(sb);
		
	}

}
