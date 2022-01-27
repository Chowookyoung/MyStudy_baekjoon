package step09;

import java.util.Scanner;

public class 택시기하학 {

	public static void main(String[] args) {
		
		//택시 기하학에서 반지름은 D(T1,T2) = |x1-x2| + |y1-y2|
		
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		
		System.out.println(Math.pow(R, 2)*Math.PI);
		System.out.println(Math.pow(R, 2)*2);
		
	}
}
