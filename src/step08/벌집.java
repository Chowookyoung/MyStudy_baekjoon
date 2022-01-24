package step08;

import java.util.Scanner;

public class 벌집 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int x=2;
		int i=1;
		while(x<=N) {
			x+=(6*i);
			i++;
		}
		System.out.println(i);
	}
}
