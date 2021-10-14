package loop_assignment2;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("별 몇 줄 출력할건지 입력하시오:");
		int num = input.nextInt();
		for(int i = 1; i<=num ; i++) {
			for(int a = 1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
