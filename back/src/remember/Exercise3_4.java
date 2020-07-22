package remember;

public class Exercise3_4 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num != 0) {
			if(num % 10 != 0) {
				num = num % 10;
				sum += num;
				System.out.println(sum + " " + num);
			}
			break;
		}
		
		
		System.out.println("sum = " + sum);
	}
}
