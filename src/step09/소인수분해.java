package step09;

import java.util.Scanner;

public class 소인수분해 {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int i = 2;
		while (N > 1) {
			if (N % i != 0) {
				i++;
			} else {
				sb.append(i + "\n");
				N /= i;
			}
		}
		System.out.println(sb);
	}
}
