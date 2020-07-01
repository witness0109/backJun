package back;

import java.util.Scanner;

public class Main2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for( int i = 0; i < T; i++) {
			int k = sc.nextInt();//Ãþ  
			int n = sc.nextInt();//È£ 
			System.out.println(el(k,n));
		}
	}
	
	private static int el(int k, int n) {
		if (n == 0) return 0;
		else if (k == 0) return n;
		else return el(k,n-1) + el(k-1,n);
	}
}
