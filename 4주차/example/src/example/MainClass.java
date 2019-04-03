package example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

public class MainClass {
	/*
	 * @FunctionalInterface functional interface, �� �Լ��� �������̽��� ObjectŬ������ �޼ҵ带 �����ϰ�
	 * �� �ϳ��� �߻� �޼ҵ常 ������ interface�̴�. �̸� üũ���ֱ� ���� �����ϴ� ���� @FunctionalInterface, �Լ���
	 * �������̽� üũ ������̼��̴�.
	 * 
	 * Object Ŭ���� �޼ҵ带 �����ϴ� ����? ��� ��ü�� Object ��ü�� ����ϰ� �ֱ� ������, Object ��ü�� �޼ҵ���� �̹�
	 * �����ϰ� �־.
	 * 
	 * �׷���, ���ٽ��� ����� functional interface�� �ν��Ͻ���.
	 * 
	 * ���ٽ� �ڹٿ����� �޼ҵ带 ��ü�� ���ؼ��� ���� �����ϰ�, �޼ҵ� �� ��ü�� ������� ���ߴ�. �ڹ��� ���ٽ��� ���ο� ����� ������ ����
	 * �ƴϰ�, ������ interface�� ���ٽ����� ǥ���� ��.
	 * 
	 * ���� �ڹ� ������ ���ο� Ŭ������ �����߸� �ν��Ͻ� ������ ����������, ���ٽ��� ���� �̰��� �ؼҵ�.
	 * 
	 * ���� ���ο� �������̽��� �������� �ʰ� ���� �����ϴ� �������̽��� ����Ͽ� ���ٽ��� ó���� ���� �ִ�. java.util.function
	 * ��Ű���� ���� functional interface���� ��ϵǾ� �ִ�. �� ��Ű���� ��ϵǾ� �ִ� ��� �������̽����� @Fun-
	 * ������̼����� �����Ǿ��ִ�. ��ǥ���� �������̽��� Consumer, Function, Predicate
	 * 
	 * �� �������̽����� java.util.stream.Stream �������̽��� ���յǾ� ������ ����� ������ ���ٽİ� stream �������̽���
	 * �����Ͽ� List�� �ϰ������� ó���� �� �ֵ��� �����ش�. ��ǥ���� �޼ҵ�� filter, map, forEach
	 */
	private static Runnable lambdaTest(Runnable runnable) {
		runnable.run();
		return () -> System.out.println("return lambda");
	}

	public static void main(String[] args) {
		lambdaTest(() -> System.out.println("input lambda")).run();

		/*
		 * java.util.Predicate ������ Ÿ�� T ������ ��ü�Է��� �޾� �� ���� true���� false������ �����Ѵ�.
		 */
		Predicate<String> stringCompare = (String str) -> str.compareTo("abc") == 0 ? true : false;
		System.out.println("Predicate test for abc=" + stringCompare.test("abc"));

		/*
		 * java.util.Function ù��° ������ �Է°��� �޾� �ι��� ���·� ����Ѵ�.
		 */
		Function<String, Integer> intFunctionLambda = (String str) -> str.compareTo("abc") == 0 ? 1 : 0;

		System.out.println("intFunctionLambda test for abc=" + intFunctionLambda.apply("abc"));

		Function<String, Float> floatFunctionLambda = (String str) -> str.compareTo("abc") == 0 ? (float) 1.0
				: (float) 0.0;

		System.out.println("floatFunctionLambda test for abc=" + floatFunctionLambda.apply("abc"));

		/*
		 * java.util.Consumer
		 * ���������� �Է°�<T>�� �޾� ó���ϰ� ����� ���� �ʴ� ������ �������̽��̴�.
		 */
		Consumer<String> c1 = t -> System.out.println(t + "8");
		c1.accept("java");
		
		/*
		 * java.util.Supplier
		 * getXXX()�޼��带 ������ ����. �Է��� ���� return�� �ִ�.
		 */
		IntSupplier is = () -> {
			int a = (int) (Math.random() * 6) + 1;
			return a;
		};

		int aa = is.getAsInt();
		System.out.println(aa);
	
		/*
		 * ���ٽ����� ���� ū ������ ���� API�� �ݷ���.
		 * forEach(), stream()
		 */
		
		/*
		 * forEach() -> List����
		 * ���� for���� �����ϰ� ��������, ���� for���� �ȿ� �ۼ��Ǵ� �ڵ尡 �����Ӱ�, ���� ������
		 * ������ �ݸ�, forEach()�� �Ұ����ϱ� ������ ���� ���α׷��ֿ����� �߿��� ��ҷ� ���ȴ�.
		 * */
		List<String> list1=new ArrayList();
		list1.add("A");
		list1.add("B");
		list1.forEach((x)->System.out.println("List item = "+x));
		
		/*
		 * Stream��ü
		 * 
		 * */
		
		
		
		
		
	}
}