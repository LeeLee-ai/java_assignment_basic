package loop_assignment2;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻʽÿ�");
		int num = input.nextInt();
		double a = Math.sqrt(num);
		int count = (int)a; // ������ Ȧ���� ������ �Է¹��� ���� �� Ȥ�� �� ���� �������� �׻� ����
		int num2 = 0;
		int num3 = 1;
		for(int i = 1; i <= count ; i++) {
			num2 += num3;  // 0���� ������
			num3 += 2; // ���� Ȧ���� 2�� ����
		}
		System.out.println(count+"��");
		System.out.println(num2);
		input.close();
	}
}
