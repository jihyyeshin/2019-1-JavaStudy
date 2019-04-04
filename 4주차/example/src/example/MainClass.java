package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainClass {
	/*
	 * �ڹ�8�� ���� ū ��ȭ�� "���ٽ�"�̶�� �� �� �ִ�. ���ٽ�? ������ ������� �ڵ带 �ۼ��ϰ� ��������! �Լ��� ����ó��! �Ϻ��� �Լ���
	 * ���α׷����̳�? �ƴϴ�. ���ο� ���ǰ� �ƴ϶�, interface ���¸� �����ͼ� ��� ���ٽ��� ���� "�Ű������� ���� �ڵ� ���"��
	 * �����, �̴� ��Ÿ�ӽÿ� �͸�����ü(�߻�޼ҵ带 �� �� ����) ����
	 *
	 * @FunctionalInterface �Լ��� �������̽� : ���ٽ��� Ÿ������ ���Ǵ� �ϳ��� �߻� �޼ҵ带 ���� �������̽�. �� �Լ���
	 * �������̽��� ObjectŬ������ �޼ҵ带 �����ϰ� �� �ϳ��� �߻� �޼ҵ常 ������ interface�̴�. �̸� üũ���ֱ� ���� �����ϴ�
	 * ���� @FunctionalInterface, �Լ��� �������̽� üũ ������̼��̴�.
	 * 
	 * Object Ŭ���� �޼ҵ带 �����ϴ� ����? ��� ��ü�� Object ��ü�� ����ϰ� �ֱ� ������, Object ��ü�� �޼ҵ���� �̹�
	 * �����ϰ� �־.
	 */

	/*
	 * ���� �ڹ� ������ ���ο� Ŭ������ �����߸� �ν��Ͻ� ������ ����������, ���ٽ��� ���� �̰��� �ؼҵ�.
	 * 
	 * ���� ���ο� �������̽��� �������� �ʰ� ���� �����ϴ� �������̽��� ����Ͽ� ���ٽ��� ó���� ���� �ִ�. java.util.function
	 * ��Ű���� ���� functional interface���� ��ϵǾ� �ִ�. �� ��Ű���� ��ϵǾ� �ִ� ��� �������̽����� @Fun-
	 * ������̼����� �����Ǿ��ִ�. ��ǥ���� �������̽��� Consumer, Function, Predicate
	 * 
	 * ���ٽ����� ���� ū ������ ���� API�� �ݷ���. forEach(), stream()
	 */

	
	/*1�� ����*/		
	
	static String getUserName() {
		String name = "jihye";
		return name;
	}

	public static void main(String[] args) {
		String name = getUserName();
		name = "hello";
		Example ex = () -> {
			return name;
		};
		System.out.println(ex.method());

		/*
		 * ������ ���� ����? ������ ���ٽ� �ȿ��� ���ǰ� �ִٸ� final�� ��������� ǥ������ �ʾҴ���, ���������� final�����̴�. ����
		 * name�� final�� ������� �ʰ�, ������ ���� �� �� �̻� �Ҵ��ϸ�, ������ �߻��Ѵ�!
		 */	
		
		/*2�� ����*/		
		
		//BinaryOperator add = (x, y) -> x + y;
		BinaryOperator<Integer> add=(x, y)->x+y;

		/*
		 * ������ ���� ����? BinaryOperator���� Ÿ���� �������־�� �ϰ�, Ÿ���� ���������� ������ Object�� �ν��Ͻ���� �߸�
		 * �����Ѵ�.
		 */
		
		/* ���� */

		lambdaTest(() -> System.out.println("input lambda")).run();

		/*
		 * java.util.function.Predicate ������ Ÿ�� T ������ ��ü�Է��� �޾� �� ���� true���� false������ �����Ѵ�.
		 */
		Predicate<String> stringCompare = (String str) -> str.compareTo("abc") == 0 ? true : false;
		System.out.println("Predicate test for abc=" + stringCompare.test("abc"));

		/*
		 * java.util.function.Function ù��° ������ �Է°��� �޾� �ι�° ���·� ����Ѵ�.
		 */
		Function<String, Integer> intFunctionLambda = (String str) -> str.compareTo("abc") == 0 ? 1 : 0;
		System.out.println("intFunctionLambda test for abc=" + intFunctionLambda.apply("abc"));
		Function<String, Float> floatFunctionLambda = (String str) -> str.compareTo("abc") == 0 ? (float) 1.0
				: (float) 0.0;
		System.out.println("floatFunctionLambda test for abc=" + floatFunctionLambda.apply("abc"));

		/*
		 * java.util.function.Consumer ���������� �Է°�<T>�� �޾� ó���ϰ� ����� ���� �ʴ� ������ �������̽��̴�.
		 */
		Consumer<String> c1 = t -> System.out.println(t + "8");
		c1.accept("java");

		/*
		 * java.util.function.Supplier getXXX()�޼��带 ������ ����. �Է��� ���� return�� �ִ�.
		 */
		IntSupplier is = () -> {
			int a = (int) (Math.random() * 6) + 1;
			return a;
		};

		int aa = is.getAsInt();
		System.out.println(aa);

		
		/*
		 * forEach() -> List���� ���� for���� �����ϰ� ��������, ���� for���� �ȿ� �ۼ��Ǵ� �ڵ尡 �����Ӱ�, ���� ������
		 * ������ �ݸ�, forEach()�� �Ұ����ϱ� ������ ���� ���α׷��ֿ����� �߿��� ��ҷ� ���ȴ�.
		 */
		List<String> list1 = new ArrayList();
		list1.add("A");
		list1.add("B");
		list1.forEach((x) -> System.out.println("List item = " + x));

		/*
		 * Stream��ü �÷��ǰ�ü�� �Լ��� ó��
		 * java.util.stream.Stream
		 */
		// �迭 ��Ʈ�� ����
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

	}

	private static Runnable lambdaTest(Runnable runnable) {
		runnable.run();
		return () -> System.out.println("return lambda");
	}

}