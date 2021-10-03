package java_assignment2;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("정수 세개를 입력하시오");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if((a>b && a>c) || (a==b && b==c)) {
			System.out.print(1);
		}
		else {
			System.out.println(0);
		}
		input.close();
	}
}
