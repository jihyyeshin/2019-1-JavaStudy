import java.util.*;

/* ��Ʈ�� ����������
 * 
 * �뷮�� �����͸� �����ؼ� ����ϴ� �� : ������ (ex. �������� �հ�, ��հ� ��)
 * �÷����� ��Ҹ� �������� ������� �ٷ� ������ �� ���ٸ�, �����ϱ� ������ "�߰�ó��"�� �ʿ��ϴ�
 * */

/* ��Ʈ���� �߰� ó�� - �������� ���͸�, ����, ����, �׷��� ��
 * ��Ʈ���� ���� ó�� - �������� �հ�, ���, ī����, �ִ밪, �ּҰ� ��
 * �̷��� �߰� ó���� ���� ó���� �������������� �ذ��Ѵ�.
 * ������������ ���� ���� ��Ʈ���� ����Ǿ� �ִ� ������ ���Ѵ�.
 * */
public class StreamPipe {
	public static void main(String[] args) {
		List<Member> list =Arrays.asList(
				new Member("ȫ", Member.MALE, 30),
				new Member("��", Member.FEMALE, 20),
				new Member("��", Member.MALE, 45),
				new Member("��", Member.FEMALE, 27)
				);
		//���������� �ڵ�
		double avgAvg=list.stream()//�������� ��Ʈ��
				.filter(m->m.getSex()==Member.MALE)//���� member��ü�� ��ҷ� �ϴ� ���ο� ��Ʈ���� �����Ѵ�.
				.mapToInt(Member :: getAge)//�߰�ó�� ��Ʈ��, member��ü�� age������ �����ؼ� ���ο� ��Ʈ���� �����Ѵ�.
				.average()//����ó��, ��հ�������, optional double�� ����Ǳ� ������
				.getAsDouble();//���⼭ getasdouble�޼ҵ带 ȣ���ؼ� ����� ��հ��� �д´�.
		System.out.println("���� ��� ����: "+avgAvg);
	}
}

class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;

	private String name;
	private int sex;
	private int age;

	Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	int getSex() {
		return sex;
	}

	int getAge() {
		return age;
	}
}
