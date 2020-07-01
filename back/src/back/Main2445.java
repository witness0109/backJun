package back;

import java.util.Scanner;

public class Main2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i,k;

		 for (i = 0; i < N; i++) {
	            for (int j = 0; j < i; j++)
	                System.out.print(" ");
	            for (k = 0; k < 2*(N - i) - 1; k++)
	                System.out.print("*");

	            System.out.println(" ");
		}
	}
}
