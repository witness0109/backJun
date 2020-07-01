package back;

import java.util.Scanner;

public class Main1037 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] Number = new int [N];
		int Max = 0;
		int Min = 0;
		
		for (int i = 0; i<N; i++) {
			Number[i] = sc.nextInt();
			
			if(i == 0) {
				Max = Number[0];
				Min = Number[0];
			}
			
			if(Max < Number[i])
				Max = Number[i];
			
			if(Min > Number[i])
				Min = Number[i];
		}
		System.out.println(Max * Min);
	
	}
}
