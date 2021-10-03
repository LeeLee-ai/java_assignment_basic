package java_assignment1;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int sum = a+b+c;
		double avg = sum/3;
		System.out.println("sum "+sum);
		System.out.println("avg "+avg);
		input.close();
	}
}
