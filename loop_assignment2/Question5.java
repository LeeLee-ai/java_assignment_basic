package loop_assignment2;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �� �� ����� ���� �Է��Ͻʽÿ�:");
		int line = input.nextInt();
		int space = 0;
		int num = line + (line-1); // ó���� ��µ� �� ����
		for(int i = 1; i<= line; i++) {
			for(int a = 0; a<space; a++) { // ���� ���� �ݺ���
				System.out.print(" ");
			}
			for(int n = 1; n<=num;n++ ) {// �� ��� �ݺ���
				System.out.print("*");
			}
			num -= 2; // ���� �ٿ� ��µ� �� ���� ���̱�
			space += 1; // ���� �ø���
			System.out.println();
		}
		input.close();
	}
}
