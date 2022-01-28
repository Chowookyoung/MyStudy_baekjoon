package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlymetotheAlphaCentauri {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int test=0;test<T;test++) {
			
			String[] input = (br.readLine()).split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			int answer = 0;
			int dis = y-x;
			if(dis<=2) {
				answer = dis;
			}else {
				int start = 3;
				int next = 0;
				int i=0;
				while(true) {
					next = start + 4 + 2*i;
					if(start<=dis&&dis<next) {
						if(dis<start+i+2) {
							answer = 2*(i+2)-1;
						}else {
							answer = 2*(i+2);
						}
						break;
					}
					start = next;
					i++;
				}
			}
			sb.append(answer+"\n");
		}
		System.out.println(sb);
	}
}
