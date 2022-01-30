package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 네번째점2 {

	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String x = "";
		String y = "";
		
		for(int i=0;i<3;i++) {
			String[] input = (br.readLine()).split(" ");
			if(x.contains(input[0])) {
				System.out.println(i+1+"번째에 여기 안들어옴?");
				x.replaceAll(input[0], "");
			}else {
				x+=input[0]+" ";
			}
			
			if(y.contains(input[1])) {
				y.replaceAll(input[1], "");
			}else {
				y+=input[1]+" ";
			}
			System.out.println(x+" "+y);
		}
		
		System.out.println(x.replaceAll(" ","")+" "+y.replaceAll(" ",""));
		
		

	}

}
