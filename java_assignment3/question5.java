package java_assignment3;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("���̿� ������ �Է��Ͻʽÿ�");
		int age = input.nextInt();
		String sex = input.next();
		if(sex.equals("M") && age>=18) {  // String�� ��ü�̱⶧���� ���ǹ� ���� ���ڿ� �ּҰ� �ٸ�, �׷��Ƿ� ==�����ڴ� �� �� ����
			System.out.println("man");
		}
		else if(sex.equals("M") && age<18){
			System.out.println("boy");
		}
		else if(sex.equals("F") && age>=18) {
			System.out.println("woman");
		}
		else if(sex.equals("F") && age<18) {
			System.out.println("girl");
		}
		else {
			System.out.println("���̿� ������ �ٽ� �Է����ֽʽÿ�");
		}
		input.close();
	}
}
