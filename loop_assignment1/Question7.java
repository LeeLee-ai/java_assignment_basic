package loop_assignment1;

public class Question7 {
	public static void main(String[] args) {
		int i;
		int b = 2;
		int a = 7;
		for(i=0;i<=4;i++) {  // �ټ� �� ��� ���
			while(b<a) {  
				System.out.print(b+" ");
				b++;
			}
			b = b-4; // 7���� 3 8���� 4 �̷�������
			a++; // �ִ� ������Ű��
			System.out.println(); //�ٹٲٱ�
		}
	}
}

