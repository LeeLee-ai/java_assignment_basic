package loop_assignment2;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int num2 = 0; // num������ �������� �ʰ� num���� ���� ��Ƶ� ����
		int i = 1;  // �Է¹��� ���� ���� ��
		do {
			System.out.print("������ �Է����ּ���:");
			num = input.nextInt();
		}while(num>100 || num<1);  // �Է����� �ݺ���
		while(true) {
			num2 = num;
			num2 = num* i;
			if(num2>100 || i >10) { // 	�ݺ��� Ż�� ����
				break;
			}
			else {
				System.out.print(num2+" ");
			}
			i += 1;
		}
		input.close();
	}
}
