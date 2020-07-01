package SU2016Competition;

import java.util.Scanner;

public class Main13206 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//TestCase 개수
		int T = sc.nextInt();
		
		//주어진 숫자 개수
		int N = sc.nextInt();
		
		//주어진 숫자
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println(GCD(arr[i],arr[5]));
		}

	}
	
	
	
	
	private static int GCD(int a, int b) {
		
		if (a % b == 0) return b;

		return GCD(b, a % b);
	}
}
