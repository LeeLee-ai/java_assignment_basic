package loop_assignment1;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int i = 0,a = 0;
		do {
			System.out.print("100이하의 정수를 입려하십시오:");
			num = input.nextInt();
		} while(num>=100);
		while(i<=num) {
			a += i;
			i++;
		}
		System.out.println(a);
		input.close();
	}
}
