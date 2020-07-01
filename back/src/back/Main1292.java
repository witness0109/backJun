package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		/*
		 * 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 
		 * 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.
		 */

		int[] arr = new int[1001];
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int cur = 1;

		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= cur; j++) {
				if (i > 1000) break;
				arr[i] = cur;
				i++;
			}
			cur++;
			i--;
		}
		int ans = 0;
		for (int i = a; i <= b; i++) {
			ans += arr[i];
		}
		System.out.println(ans + "\n");
		br.close();
	}
}
