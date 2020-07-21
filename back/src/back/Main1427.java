package back;

import java.util.*;

/*
 * 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * 2143 입력 / 4321 출력
 * */


public class Main1427 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		for (int i = 0; i < a.length(); i++) {
			list.add(a.charAt(i) - 48);
		}

		Collections.sort(list);
		
		for (int i = a.length() - 1; i > -1; --i) {
			System.out.print(list.get(i));
		}

	}
}
