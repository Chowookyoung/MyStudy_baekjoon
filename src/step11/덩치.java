package step11;

import java.util.Scanner;

public class 덩치 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] xy = new int[3][N];
		for (int i = 0; i < N; i++) {
			xy[0][i] = sc.nextInt();
			xy[1][i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (xy[0][i] < xy[0][j] && xy[1][i] < xy[1][j]) {
					xy[2][i]++;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(xy[2][i] + 1);
		}

	}

}
