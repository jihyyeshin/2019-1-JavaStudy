/* stream�� ����. 
 * java.util.stream�� ���� stream API�� �ֵ�.
 * base stream�� stream, intstream, longstream, doublestream�� �ִ�!
 * stream�� ��ü ��Ҹ� ó��
 * intstream, longstream, doublestream�� ������ �⺻ Ÿ���� ó����.
 * */

// �÷������κ��� ��Ʈ�� ���
// List<Student> Collection���� Stream<Student>�� ���� ��Ҹ� �ֿܼ� ����Ѵ�.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {
	public static void main(String[] args) {
		List<Student> studentList=Arrays.asList(
			new Student("ȫ�浿", 10),
			new Student("�ſ��", 20),
			new Student("���̼�", 30)
		);
		
		Stream<Student> stream=studentList.parallelStream();
		stream.forEach(s->System.out.println(s.getName()));
	}
}
