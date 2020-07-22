package back;

import java.util.Scanner;

public class Main1003_1 {
	//fibonacci 함수 이용하여 해결
	//// 시간 초과
	//전역변수
	static int zero;
	static int one;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[] arr = new int[t * 2];

		for (int i = 0; i < t; i++) {
			zero = 0;
			one = 0;
			int a = sc.nextInt();

			fibonacci(a);

			arr[i * 2] = zero;
			arr[i * 2 + 1] = one;
		}

		for (int i = 0; i < t; i++)
			System.out.println(arr[i * 2] + " " + arr[i * 2 + 1]);
		sc.close();
	} //end main 

	static int fibonacci(int n) {
		if (n == 0) {
			zero++;
			return 0;
		} else if (n == 1) {
			one++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
}
