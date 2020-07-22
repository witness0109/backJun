package algoritm;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main10827 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		int b = sc.nextInt();
		
		BigDecimal c = a.pow(b);
		System.out.println(c.toPlainString()); //생성자로 전달받은 값을 지수 표현없이 반환한다
	
	
	}
}
