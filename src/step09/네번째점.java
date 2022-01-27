package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 네번째점 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> x = new ArrayList<>();
		ArrayList<String> y = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			
			String[] input = (br.readLine()).split(" ");
			x.add(input[0]);
			y.add(input[1]);
			
		}
		
		String X = x.stream().distinct().toString();
		String Y = y.stream().distinct().toString();
		
		System.out.println(X+" "+Y);
		

	}

}
