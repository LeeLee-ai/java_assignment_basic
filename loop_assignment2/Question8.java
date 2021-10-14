package loop_assignment2;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		do {  
			System.out.print("정수 하나를 입력하시오:");
			num = input.nextInt();
		}while(num<0);
		int space = 0; // 띄어쓰기 개수를 위한 변수
		int n = 1;  // 한줄에 숫자를 몇개 출력할지 조절하기 위한 변수
		int c = 1;  // 누적되는 숫자 저장할 변수
		for(int i = 1; i<=num; i++) {
			for(int b = 0; b<space; b++) { // 띄어쓰기 반복문
				System.out.print(" ");
			}
			for(int a = num; a>=n; a--) { // 숫자 출력 반복문
				System.out.print(c+" ");
				c += 1;
			}
			space += 2; // 띄어쓰기 자리가 개행할때마다 2씩 늘어나기 때문에
			n += 1;  // 출력되는 숫자 개수가 개행할때마다 하나씩 줄어들기 때문에
			System.out.println(); 
		}
		input.close();
	}
}