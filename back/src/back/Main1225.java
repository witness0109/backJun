package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		String a = st.nextToken();
		String b = st.nextToken();
		
		String aa[] = a.split("");
		String bb[] = b.split("");
		int n = aa.length;
		int m = bb.length;
		long sumA=0, sumB=0;
		
		for(int i=0; i<n; i++){
			sumA += Integer.parseInt(aa[i]);
		}
		
		for(int i = 0; i<m; i++) {
			sumB += Integer.parseInt(bb[i]);
		}
		
		long res = sumA*sumB;
		
		System.out.println(res);
	}
}
