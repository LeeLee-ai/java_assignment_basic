package java_assignment1;

public class question2 {
	public static void main(String[] args) {
		for (int a=1; a<27; a++)  // T 글자수에 맞춰서 줄의 끝부분에 해당하는 것들만 손본다
			if(a==10) { // 줄바꿈만 하면 됨
				System.out.println("T");
			}
			else if(a==20 || a==22 || a==24) { // 줄바꿈 후 띄어쓰기까지
				System.out.println("T");
				System.out.print("    ");
			}
			else {
				System.out.print("T");
			}
	}
}
