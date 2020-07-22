package algoritm;

import java.util.*;

public class Main10828 {
    public static void main(String args[]) {
    	/*
    	���� �������� �ڷḦ �ְ� �� �� �ִ� �ڷ�
    	LAST IN FRIST OUT (LIFO)
    	- push : ���ÿ� �ڷḦ �ִ� ����
    	- pop : ���ÿ��� �ڷḦ ���� ����
    	- top : ������ ���� ���� �ִ� �ڷḦ ���� ����
    	- empty : ������ ����ִ��� �ƴ����� �˾ƺ��� ����
		- size : ���ÿ� ����Ǿ� �ִ� �ڷ��� ������ �˾ƺ��� ����
    	*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // ���� �ڿ� \n�� �־ �ʿ��մϴ�
        Stack<Integer> stack = new Stack<Integer>();
        for (int k=0; k<n; k++) {
            String line = sc.nextLine();
            String[] s = line.split(" ");
            String cmd = s[0];
            if (cmd.equals("push")) {
                int num = Integer.parseInt(s[1]);
                stack.push(num);
            } else if (cmd.equals("top")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                if (stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}