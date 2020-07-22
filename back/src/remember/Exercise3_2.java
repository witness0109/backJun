package remember;

public class Exercise3_2 {
	public static void main(String[] args) {

		
		
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과 계산
		
		int sum = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = 1; j <= i; j++) {
				sum += j;
			}

		}

		System.out.println(sum);

	}
}
