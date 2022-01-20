package step11;

import java.util.Scanner;

public class 분해합 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int i = 1;
		while (i < N) {
			int num = i;
			int sum = i;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}

			if (sum == N) {
				break;
			}
			i++;
		}

		if (i == N)
			i = 0;

		System.out.println(i);
	}
}
