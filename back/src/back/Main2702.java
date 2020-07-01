package back;

import java.util.Scanner;

public class Main2702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = GCD(a, b);
			System.out.print(a * b / k + " ");
			System.out.println(k);
		}
	}

	public static int GCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}
}
