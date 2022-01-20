package step10;

import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(factorial(N));

	}
	public static int factorial(int N) {
		int result=1;
		while(N>0) {
			result*=N;
			N--;
		}
		return result;
	}

}
