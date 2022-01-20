package step11;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //카드 개수
		int M = sc.nextInt(); //원하는 합

		int[] card = new int[N];

		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}

		int max = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (card[i] + card[j] + card[k] <= M && max < card[i] + card[j] + card[k]) {
						max = card[i] + card[j] + card[k];
					}
				}
			}
		}

		System.out.println(max);

	}

}
