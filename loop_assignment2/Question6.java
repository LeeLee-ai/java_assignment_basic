package loop_assignment2;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int num2 = 0; // num변수에 누적되지 않게 num값을 새로 담아둘 변수
		int i = 1;  // 입력받은 수에 곱할 수
		do {
			System.out.print("정수를 입력해주세요:");
			num = input.nextInt();
		}while(num>100 || num<1);  // 입력조건 반복문
		while(true) {
			num2 = num;
			num2 = num* i;
			if(num2>100 || i >10) { // 	반복문 탈출 조건
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
