package Que;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main10845 {
	public static void main(String[] args) {
		int b = 0;
		Queue<Integer> que = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {

			String a = sc.next();
			if (a.equals("push")) {
				b = sc.nextInt();
				que.add(b);
			} else if (a.equals("front")) {
				System.out.println(que.isEmpty() ? -1 : que.peek());
			} else if (a.equals("back")) {
				System.out.println(que.isEmpty() ? -1 : b);
			} else if (a.equals("size")) {
				System.out.println(que.size());
			} else if (a.contentEquals("pop")) {
				System.out.println(que.isEmpty() ? -1 : que.poll());
			} else if (a.equals("empty")) {
				System.out.println(que.isEmpty() ? 1 : 0);
			}

		}

	}
}
