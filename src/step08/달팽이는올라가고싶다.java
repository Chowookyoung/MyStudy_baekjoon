package step08;

import java.util.Scanner;

public class 달팽이는올라가고싶다 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int day = 1;
		int sum = 0;
		while(true) {
			sum+=A;
			if(sum>=V) {
				break;
			}
			sum-=B;
			day++;
		}
		
		System.out.println(day);
		
	}

}
