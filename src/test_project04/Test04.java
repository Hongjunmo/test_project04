package test_project04;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;

		System.out.println("---��Ź��---");
		while (true) {
			System.out.println("1.���� on"); // û�ϴ�
			System.out.println("2.���� off"); // ȫ�ظ�
			System.out.println("3.��Ź"); // ��ȯ��
			System.out.println("4.���"); // �����
			System.out.println("5.Ż��"); // �ҿ���
			System.out.print(">>>> : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("������ �մϴ�");
				break;
			case 2:
				System.out.println("������ ���ϴ�");
				break;
			case 3:
				System.out.println("��Ź ����");
				break;
			case 4:
				System.out.println("��� ����");
				break;
			case 5:
				System.out.println("Ż�� ����");
				break;
			default:
				System.out.println("�߸� �Է�");
				break;
			}
		}

	}
}
