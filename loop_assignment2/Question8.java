package loop_assignment2;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		do {  
			System.out.print("���� �ϳ��� �Է��Ͻÿ�:");
			num = input.nextInt();
		}while(num<0);
		int space = 0; // ���� ������ ���� ����
		int n = 1;  // ���ٿ� ���ڸ� � ������� �����ϱ� ���� ����
		int c = 1;  // �����Ǵ� ���� ������ ����
		for(int i = 1; i<=num; i++) {
			for(int b = 0; b<space; b++) { // ���� �ݺ���
				System.out.print(" ");
			}
			for(int a = num; a>=n; a--) { // ���� ��� �ݺ���
				System.out.print(c+" ");
				c += 1;
			}
			space += 2; // ���� �ڸ��� �����Ҷ����� 2�� �þ�� ������
			n += 1;  // ��µǴ� ���� ������ �����Ҷ����� �ϳ��� �پ��� ������
			System.out.println(); 
		}
		input.close();
	}
}