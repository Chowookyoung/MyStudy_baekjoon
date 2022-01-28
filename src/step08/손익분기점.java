package step08;

import java.util.Scanner;

public class 손익분기점 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int point = -1;
		if(C>B) point=(int)(A/(C-B))+1;
		
		System.out.println(point);
	}
}
