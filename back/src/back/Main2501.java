package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2501 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		
		for(int i = 1; i <= A; i++) {
			if( A % i == 0) K--;
			
			if( K == 0) {
				System.out.println(i);
				break;
			}	
		}
		if ( K != 0)
			System.out.println(0);
		
		br.close();
	}
}
