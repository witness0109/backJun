package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[1001];
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int cur = 1;

		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= cur; j++) {
				if (i > 1000)
					break;
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
