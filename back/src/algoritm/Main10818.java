package algoritm;

import java.util.Scanner;

public class Main10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lim = sc.nextInt();
		int[] array = new int[lim];
		int min = 10000000;
		int max = -10000000;

		for (int i = 0; i < lim; i++) {
			array[i] = sc.nextInt();
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}

		System.out.println(min + " " + max);
	}
}
