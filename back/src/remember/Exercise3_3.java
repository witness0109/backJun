package remember;

public class Exercise3_3 {
	public static void main(String[] args) {

		int cnt = 0;

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) { 
					cnt++;
					System.out.println(i + " + " + j + " = " + (i+j));
				}
			}
		}
		System.out.println(cnt + "��");
	} // main
}
