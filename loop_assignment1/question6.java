package loop_assignment1;

import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		do {
			System.out.print("�ﰢ�� �غ��� ���̸� �Է��Ͻÿ�:");
			int base = input.nextInt();
			System.out.print("�ﰢ�� ������ ���̸� �Է��Ͻÿ�:");
			int height = input.nextInt();
			System.out.println((height * base)/2);
			System.out.println("continue?");
			answer = input.next();
		} while(answer.equals("Y") || answer.equals("y"));
		input.close();
	}
}
