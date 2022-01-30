package step09;

import java.util.Scanner;

public class 골드바흐의추측 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0;i<T;i++) {
			int n = sc.nextInt();
			
			int n2 = n/2;
			int j=0;
			while(j<n/2) {
				
				//n2-j과 n2+j이 소수인지.
				int k=2;
				while(k<n2-j) {
					if((n2-j)%k==0) {
						break;
					}
					k++;
				}
				
				int l=2;
				while(l<n2+j) {
					if((n2+j)%l==0) {
						break;
					}
					l++;
				}
				
				//만약 k+l이 n인 경우에
				if(k+l==n) {
					sb.append((n2-j)+" "+(n2+j)+"\n");
					break;
				}
				
				j++;
			}
		}
		System.out.println(sb);
	}
}
