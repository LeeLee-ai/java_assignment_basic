package loop_assignment2;

import java.util.Scanner;
import java.util.Random;

public class Question9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis()); // ���� �õ� ���� ���� (�õ尡 ������ �Ȱ��� ������ ���)
		System.out.print("����� �������� ũ�⸦ �Է��Ͻʽÿ�:");
		int size = input.nextInt();
		for(int i = 1; i<=size; i++) {
			for(int a = 1; a<=size; a++) {
				int b = rand.nextInt(9)+1; // �������� 1���� 9����
				while(b%2==0) { // ¦�� �Ÿ��� �ݺ���
					b = rand.nextInt(9)+1;
				}
				System.out.print(b+" ");
			}
			System.out.println();
		}
		input.close();
	}
}
