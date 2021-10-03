package java_assignment3;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("나이와 성별을 입력하십시오");
		int age = input.nextInt();
		String sex = input.next();
		if(sex.equals("M") && age>=18) {  // String은 객체이기때문에 조건문 안의 문자와 주소가 다름, 그러므로 ==연산자는 쓸 수 없다
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
			System.out.println("나이와 성별을 다시 입력해주십시오");
		}
		input.close();
	}
}
