package loop_assignment2;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		do {  // 자연수인지 검사
			System.out.print("정수 하나를 입력하시오:");
			num = input.nextInt();
		}while(num<0);
		int space = num + (num-2); // 띄어쓰기 개수 변수
		for(int i = 1; i<=num; i++) {
			for(int b = space; b>0; b--) { // 띄어쓰기 반복문
				System.out.print(" ");
			}
			for(int a = 1; a<=i; a++) {  // 숫자 출력 반복문
				System.out.print(a+" ");
			}
			space -= 2; // 한줄 출력할떄마다 띄어쓰기 공간이 2만큼 줄어듬
			System.out.println(); // 개행
		}
		input.close();
	}
}
