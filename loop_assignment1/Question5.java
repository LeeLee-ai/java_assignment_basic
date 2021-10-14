package loop_assignment1;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int a = 0;
		while(true) {
			System.out.print("정수를 입력하시오");
			a = input.nextInt();
			if(a==0) {
				break;
			}
			else {
			if(a%3==0 || a%5==0) {
				continue;
			}
			else {
				num++;
			}
		}
		}
		System.out.println(num);
		input.close();
	}
}