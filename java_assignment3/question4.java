package java_assignment3;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("���� �Է��Ͻʽÿ�");
		int month = input.nextInt();
		if((month%2==1 && month<8) || (month%2==0 && month>7 && month<13)) { // 8���� �Ǳ��������� Ȧ������ 31�� �� ���ϴ� �ݴ�)
			System.out.println("31��");
		}
		else if(month!=2 && ((month%2==0 && month<8) || (month%2==1 && month>7 && month<13))) { // 2���� �ƴϰ� 8���� �Ǳ��������� ¦������ 30�� 8���� �� ���Ĵ� �� �ݴ�
			System.out.println("30��");
		}
		else if(month == 2) { // 2���� 28���̰ų� ������ ��� 29��
			System.out.println("28���̳� 29��");
		}
		else {
			System.out.println("1���� 12�����Դϴ�");
		}
		input.close();
	}
}
