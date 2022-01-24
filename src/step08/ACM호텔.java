package step08;

import java.util.Scanner;

public class ACM호텔 {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// 테스트 데이터 수

		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			int roomNum = (N / H) + 1; // 호 수
			int floor = (N % H); // 층 수
			if (floor == 0) {// 맨 꼭대기 층일 경우
				floor = H;
				roomNum = N / H;
			}
			String room = floor + "" + roomNum;
			if (roomNum < 10)
				room = floor + "0" + roomNum;
			sb.append(room + "\n");
		}
		System.out.println(sb);
	}
}
