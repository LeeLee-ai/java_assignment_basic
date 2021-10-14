package loop_assignment2;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("행을 입력하시오:");
		int column = input.nextInt();
		System.out.print("열을 입력하시오:");
		int row = input.nextInt();
		int count = 1;
		int b = 1;
		for(int i = 1; i<=column; i++) {
			b = i;
			while(count<=row) {
				System.out.print(b+" ");
				b += i;
				count++;
			}
			count = 1;
			System.out.println();
		}
		input.close();
	}
}
