import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int snail = 0;
		int i ;
		for(i = 1 ; snail < c; i++  ) {
			snail +=a;
			if(snail>=c) {
				break;
			}
			snail -=b;
			
		}
		System.out.println(i);
	}
}