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
		
		String[] input = (br.readLine()).split(" ");
		x.add(input[0]);
		y.add(input[1]);
		
		for(int i=0;i<2;i++) {
			
			boolean x_check = true;
			boolean y_check = true;
			
			input = (br.readLine()).split(" ");
			
			for(int j=0;j<x.size();j++) {
				if(x.get(j).equals(input[0])) {
					x.remove(j);
					x_check = false;
				}
			}
			for(int j=0;j<y.size();j++) {
				if(y.get(j).equals(input[1])) {
					y.remove(j);
					y_check = false;
				}
			}
			
			if(x_check)
				x.add(input[0]);
			if(y_check)
				y.add(input[1]);
		}
		System.out.println(x.get(0)+" "+y.get(0));
	}
}
