package loop_assignment2;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		do {  // �ڿ������� �˻�
			System.out.print("���� �ϳ��� �Է��Ͻÿ�:");
			num = input.nextInt();
		}while(num<0);
		int space = num + (num-2); // ���� ���� ����
		for(int i = 1; i<=num; i++) {
			for(int b = space; b>0; b--) { // ���� �ݺ���
				System.out.print(" ");
			}
			for(int a = 1; a<=i; a++) {  // ���� ��� �ݺ���
				System.out.print(a+" ");
			}
			space -= 2; // ���� ����ҋ����� ���� ������ 2��ŭ �پ��
			System.out.println(); // ����
		}
		input.close();
	}
}
