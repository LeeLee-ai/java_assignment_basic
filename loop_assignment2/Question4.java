package loop_assignment2;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�� �� �� ����Ұ��� �Է��Ͻÿ�:");
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
