package step09;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수구하기 {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] input = bf.readLine().split(" ");
		
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		
//		Scanner sc = new Scanner(System.in);
//		int M = sc.nextInt();
//		int N = sc.nextInt();

		for (int i = M; i <= N; i++) {
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					break;
				}
				j++;
			}
			if (j == i) {
				sb.append(i + "\n");
			}

		}
		System.out.println(sb);
	}
}
