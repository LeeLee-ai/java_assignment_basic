package loop_assignment1;

import java.util.*;

public class Question3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�Ѱ��� �ڿ����� �Է��Ͻʽÿ�");
		int num = input.nextInt();
		for(int i = 1; i<=10; i++) {
			System.out.print(num * i+" ");
		}
		input.close();
	}
}
