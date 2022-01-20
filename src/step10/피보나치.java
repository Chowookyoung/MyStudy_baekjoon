package step10;

import java.util.Scanner;


public class 피보나치 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibonachi(n));

	}
	
	public static int fibonachi(int N) {
		int num1 = 0;
		int num2 = 1;
		int result = 0;
		if(N<=1) {
			result = N;
		}
		while(N>1) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			N--;
		}
		return result ;
	}

}
