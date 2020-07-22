package remember;

import java.util.Scanner;

public class Exercise3_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int sum = 0;

		while (flag) {

			int num = sc.nextInt();

			if (num == 0) // 0 입력시 탈출
				flag = false;
			else
				sum += num;

		}
		sc.close();
		System.out.println(sum);
	}
}
