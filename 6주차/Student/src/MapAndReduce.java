import java.util.*;
//��Ʈ���� �߰� ó���� ���� ó���� �Ѵ�.
public class MapAndReduce {
	public static void main(String[] args) {
		List<Student> sl=Arrays.asList(
				new Student("ȫ", 10),
				new Student("��",20),
				new Student("��",30)
				);
		/* arrays.asList
		 * ArrayList, List�� ���������� �迭�̴�. asList�� ��ȯ�ϴ� List�� �迭�� ���� �ȴ�.
		 * �� �� ���� �迭�� �ּ� ���� �������� �ǹǷ�, ���� �迭�� ���뵵 ����ȴ�.
		 * �̷��� ������ Arrays.asList�� ���� List�� ���ο� ���Ҹ� �߰��ϰų� ������ ���� ����.
		 * �׷��� Arrays.asList�� �� �̿��ұ�?
		 * Arrays.asList�� �迭�� ������ �����Ϸ��� �� �� List�� �ٲ㼭 ���ϰ� ����ϱ� ����!
		 * */
		
		double avg=sl.stream()
				//�߰�ó��
				.mapToInt(Student::getScore)//������ ������
				//����ó��
				.average()//intstream�� ����� ���ϴ� �޼���
				.getAsDouble();//�̸� double������ �����´�.
		
		System.out.println("��� ����: "+avg);
	}
}
//��, ó�� �ܰ踦 ���� �� ��ĥ �� �ִ�. �׷� ������ stream�� �޼������ ���ǵǾ� ����.
