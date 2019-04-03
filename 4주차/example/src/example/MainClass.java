package example;

public class MainClass{
	/*
	 * @FunctionalInterface
	 * functional interface, �� �Լ��� �������̽��� ObjectŬ������ �޼ҵ带 �����ϰ� �� �ϳ��� �߻� �޼ҵ常 ������ interface�̴�.
	 * �̸� üũ���ֱ� ���� �����ϴ� ���� @FunctionalInterface, �Լ��� �������̽� üũ ������̼��̴�.
	 * 
	 * Object Ŭ���� �޼ҵ带 �����ϴ� ����? ��� ��ü�� Object ��ü�� ����ϰ� �ֱ� ������,  
	 * Object ��ü�� �޼ҵ���� �̹� �����ϰ� �־.
	 * 
	 * �׷���, ���ٽ��� ����� functional interface�� �ν��Ͻ���.
	 * 
	 * ���ٽ�
	 * �ڹٿ����� �޼ҵ带 ��ü�� ���ؼ��� ���� �����ϰ�, �޼ҵ� �� ��ü�� ������� ���ߴ�.
	 * �ڹ��� ���ٽ��� ���ο� ����� ������ ���� �ƴϰ�, ������ interface�� ���ٽ����� ǥ���� ��.
	 * 
	 * ���� �ڹ� ������ ���ο� Ŭ������ �����߸� �ν��Ͻ� ������ ����������, ���ٽ��� ���� �̰��� �ؼҵ�.
	 * 
	 * ���� ���ο� �������̽��� �������� �ʰ� ���� �����ϴ� �������̽��� ����Ͽ� ���ٽ��� ó���� ���� �ִ�.
	 * java.util.function ��Ű���� ���� functional interface���� ��ϵǾ� �ִ�.
	 * �� ��Ű���� ��ϵǾ� �ִ� ��� �������̽����� @Fun- ������̼����� �����Ǿ��ִ�.
	 * ��ǥ���� �������̽��� Consumer, Function, Predicate
	 * 
	 * �� �������̽����� java.util.stream.Stream �������̽��� ���յǾ� ������ ����� ������
	 * ���ٽİ� stream �������̽��� �����Ͽ� List�� �ϰ������� ó���� �� �ֵ��� �����ش�. 
	 * ��ǥ���� �޼ҵ�� filter, map, forEach
	 * */
	private static Runnable lambdaTest(Runnable runnable) {
		runnable.run();
		return ()->System.out.println("return lambda");
	}
	public static void main(String[] args) {
		lambdaTest(()->System.out.println("input lambda")).run();
		
	}
	
}