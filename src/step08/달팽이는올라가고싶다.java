package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = (br.readLine()).split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);
		
		
		int sum = (int)((V-A)/(A-B));
		if((V-A)%(A-B)!=0) {
			sum+=2;
		}else {
			sum+=1;
		}
		
		System.out.println(sum);
	}
}
