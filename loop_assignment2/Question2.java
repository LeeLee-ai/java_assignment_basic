package loop_assignment2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하십시오:");
		int a = input.nextInt();
		int b = input.nextInt();
		for(int i = 1; i<=9; i++) {
			for(int v = a;v>=b;v--) {
				System.out.print(v+"*"+i + "=" + v*i + "   ");
			}
			System.out.println();
		}
		input.close();
	}
}
