package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기 {
	
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int k = 1;
		while (Math.pow(3, k) != N) {
			k++;
		}

		char[][] stars = new char[N][N];

		star(stars, N, k);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (stars[i][j] == ' ') {
					sb.append(stars[i][j]);
				} else {
					sb.append("*");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);

	}

	public static void star(char[][] stars, int N, int k) {
		
		for (int pow = 1; 1 <= k; k--, pow *= 3) {
			for (int i = pow; i < N; i += pow * 3) {
				for (int j = pow; j < N; j += pow * 3) {
					for (int a = i; a < i + pow; a++) {
						for (int b = j; b < j + pow; b++) {
							stars[a][b] = ' ';
						}
					}
				}
			}

		}
	}
}
