import java.io.*;

public class Stream1 {
	public static void main(String[] args) throws IOException {
	OutputStream os =new FileOutputStream("C:\\Users\\tlsjh\\OneDrive\\���� ȭ��\\text.txt");
	byte[] data="ABC".getBytes();
	for(int i=0;i<data.length;i++) {
		/*
		 * OutputStream�� write(int b), write(byte[] b), write(byte[] b, int off, int len)
		 * �̷��� 3���� overloading�� �޼ҵ带 ������ �ִµ�, write(int b)���� b �� ������ 1byte���� ��� ��Ʈ������ ������.
		 * �׸���, �̸� Ȱ���� ���� int���� ������ �翬�� ������� ���ϰ�, byte�� �Ѱ��� ������ ���� ����� �����ϴ�.
		 * �׷��ٸ� �� int b�� ���������?
		 * �׸��� os.write(data[i])�ϸ� write(byte[] b)�� ������ ������, write(int b)�� ������ ������ �𸣰���.
		 * */
		os.write(data[i]);
		//os.write(data);
	}
	/*�� �̷� ������ ������ �𸣰���*/
	FileOutputStream os1=new FileOutputStream("C:\\Users\\tlsjh\\OneDrive\\���� ȭ��\\text2.txt");
	Object s=new String("hello");
	System.out.println(s);
	System.out.println("complete");
	}
	
	
}
