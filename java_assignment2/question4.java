package java_assignment2;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("�μ��� Ű�� �����Ը� �Է��Ͻʽÿ�");
		int height1 = input.nextInt();
		int weight1 = input.nextInt();
		System.out.println("�⿵���� Ű�� �����Ը� �Է��Ͻʽÿ�");
		int height2 = input.nextInt();
		int weight2 = input.nextInt();
		if(height1>height2 && weight1>weight2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		input.close();
	}	
}
