package algoritm;

import java.math.BigInteger;
import java.util.Scanner;

public class Main10826_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ZERO;
		
		for(int i =2; i<=n; i++) {
			c = a.add(b);
			a = b;
			b = c;
			
		}
		
		System.out.println(c);
	}
}
