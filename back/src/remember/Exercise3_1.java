package remember;

public class Exercise3_1 {
	public static void main(String[] args) {

		
		// 1~20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ����
		
		int sum = 0;

		for (int i = 0; i <= 20; i++) {

			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
				System.out.println(i);
			}

		}

		System.out.println(sum);
	}
}
