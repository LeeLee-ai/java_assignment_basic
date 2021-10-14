package loop_assignment1;

import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		do {
			System.out.print("삼각형 밑변의 길이를 입력하시오:");
			int base = input.nextInt();
			System.out.print("삼각형 높이의 길이를 입력하시오:");
			int height = input.nextInt();
			System.out.println((height * base)/2);
			System.out.println("continue?");
			answer = input.next();
		} while(answer.equals("Y") || answer.equals("y"));
		input.close();
	}
}
