import java.util.*;
import java.util.stream.IntStream;

/* ����
 * �߰� ó�� �������, ��Ʈ���� ��Ҹ� �ٸ� ��ҷ� ��ó�Ѵ�.
 * flatXXX(), mapXXX(), asDoubleStream(), asLongStream(), boxed�� �ִ�.
 * 
 * flatMapXXX �޼ҵ�� ��Ҹ� ��ü�ϴ� ���� ���� ��ҵ�� ������ ���ο� ��Ʈ���� �����Ѵ�.
 * mapXXX() �޼ҵ�� ��Ҹ� ��ü�ϴ� ��ҷ� ������ ���ο� ��Ʈ���� �����Ѵ�. 
 * asDoubleStream() �޼ҵ�� int��� �Ǵ� LongStream�� long��Ҹ� double��ҷ� Ÿ�� ��ȯ�Ͽ� DoubleStream�� �����Ѵ�.
 * boxed() �޼ҵ�� int, long, double ��Ҹ� Integer, Long, Double��ҷ� �ڽ��ؼ� Stream�� �����Ѵ�.
 * */

/* ���� sorted
 * �߰� �ܰ迡�� ��Ҹ� �����ؼ� ���� ó�� ������ ������ �� �ִ�.
 * 
 * */
public class Student1 implements Comparable<Student1>{
	private String name;
	private int score;
	
	public Student1(String name, int score) {
		this.name=name;
		this.score=score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
	
	@Override
	public int compareTo(Student1 o) {
		return Integer.compare(score, o.getScore());
		//�� ���� �� ũ�� ���, ������ 0, �� ���� �� ũ�� ����
	}
}

class SortingExample{
	public static void main(String[] args) {
		//���� ����� ���
		IntStream is=Arrays.stream(new int[] {5, 3, 2, 1, 4});
		is
		 .sorted()
		 .forEach(n->System.out.println(n+","));
		System.out.println();
		//��ü����� ���
		List<Student1> sl=Arrays.asList(
				new Student1("ȫ", 30),
				new Student1("��", 10),
				new Student1("��", 20)
				);
		
		sl.stream()
			.sorted()//������ �������� �������� ����
			// sorted ((a, b)->a.compareTo(b)); & sorted(Comparator.naturalOrder()); ��� ����
			.forEach(s->System.out.print(s.getScore()+","));
		System.out.println();
		
		sl.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s->System.out.print(s.getScore()+","));
	}
}