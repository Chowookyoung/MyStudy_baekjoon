package step08;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수AplusB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//BigInteger이라는 클래스를 활용하는 것이 좋다.
		//BigInteger은 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자이든지 담을 수 있다.
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B));
	}
}
