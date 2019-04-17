import java.util.Arrays;
import java.util.List;

/* filtering
 * distinct(), filter()
 * ���͸��� �߰� ó�� �������, ��Ҹ� �ɷ����� ������ �Ѵ�.
 * distinct()�� �ߺ��� �����ϰ�, filter�� ���ǿ� ���� ���͸��� ���ش�.
 * */
public class Filtering {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("ȫ", "�ſ�", "��", "�ſ�", "�Ź�");
		
		//distinct�� �ߺ� ���� �����Ѵ�.
		names.stream()
			.distinct()
			.forEach(n->System.out.println(n));
		System.out.println();
		//���ǿ� ���� filtering
		names.stream()
			.filter(n->n.startsWith("��"))
			.forEach(n->System.out.println(n));
		System.out.println();
		//�ߺ����� �� �� filtering
		names.stream()
			.distinct()
			.filter(n->n.startsWith("��"))
			.forEach(n->System.out.println(n));
	}
}
