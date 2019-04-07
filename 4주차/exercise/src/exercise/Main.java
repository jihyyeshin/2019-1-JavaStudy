package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("?");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		int num, pnumber, i;
		boolean find = false;
		Thread th = new Thread(new Main());
		String buf;
		Scanner sc = new Scanner(System.in);
		List<Student> sList = new ArrayList();
		while (true) {
			System.out.print("��ȣ�� �Է��ϼ��� >> ");
			num = sc.nextInt();// ��ȣ �Է�
			switch (num) {
			case 1:// ��ȸ�ϱ�
				System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
				pnumber = sc.nextInt();// ��ȭ��ȣ �Է�
				for (i = 0; i < sList.size(); i++) {
					if (sList.get(i).getPnumber() == pnumber) {
						System.out.println("�ش� �����͸� ã�ҽ��ϴ�.");
						System.out.println("�̸�: " + sList.get(i).getName() + " �г�: " + sList.get(i).getGrade() + " �ּ�: "
								+ sList.get(i).getAddress() + " ��ȭ��ȣ: " + sList.get(i).getPnumber());
						find = true;
					}
				}
				if (find == false) {
					System.out.println("�ش� �����͸� ã�� �� �����ϴ�.");
					//th.start();
				}
				break;
			case 2:// �߰��ϱ�
				System.out.println("�л� ������ �߰��ϼ���");
				sc.nextLine();
				buf = sc.nextLine();
				sList.add(new Student(buf.split(" ")[0], buf.split(" ")[1], buf.split(" ")[2],
						Integer.parseInt(buf.split(" ")[3])));
				break;
			}

		}

	}
}
