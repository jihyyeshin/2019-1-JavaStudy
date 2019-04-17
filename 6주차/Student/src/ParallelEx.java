/*
 * ���� �ݺ��ڸ� ����ϱ� ������ ���� ó���� ����.
 * �ܺ� �ݺ��ڴ� �����ڰ� ���� �ݺ�
 * ���� �ݺ��ڴ� �ݺ��� ���ο��� ��.�����ڴ� ��� ó�� �ڵ忡�� ������ �� �ִ�. & ���� ó���� ���ο��� �ȴ�. - �ӵ� ���
 * */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelEx {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("ȫ", "��", "��","��","��");
		//���� ó��
		Stream<String> stream=list.stream();
		stream.forEach(ParallelEx :: print);
		/*
		 * double colon?
		 * 
		 * Comparator c = (Computer c1, Computer c2) -> c1.getAge().compareTo(c2.getAge());��
		 * Comparator c = Comparator.comparing(Computer::getAge);�̿� ���� ǥ���� �� �ֵ�.
		 * ��ü :: �޼ҵ� ���� ��� �͸� �˰� ������ �ȴ�.
		 * 
		 * static�� �ʿ�� ����. ��Ȳ�� ���� �� ���� �ִ�.
		 * */
		
		System.out.println();
		
		//���� ó��
		Stream<String> paStream=list.parallelStream();
		paStream.forEach(ParallelEx :: print);
		
		//���� ó��, parallel Stream ó���� �ϸ� ���������� ó���Ǵ� ���� �� �� �ִ�. ������� ����� �������� ����!
	}
	public static void print(String str) {
		System.out.println(str+" : "+Thread.currentThread().getName());
	}
}
