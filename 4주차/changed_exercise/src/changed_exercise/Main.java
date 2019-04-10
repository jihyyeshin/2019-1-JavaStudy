package changed_exercise;

import java.util.*;

public class Main {
	/* collections framework���� collection�� map�� �ְ�,
	 * collection���� list, set, queue�迭 3������ ������. �̵��� ��� �������� ���� interface�̴�.
	 * ������ �ڽŵ鸸�� ������ Ư¡�� ������ �ִ�.
	 * 
	 * Queue
	 * 
	 * List
	 * ������ ������, ������ �������� �ߺ��� �����ϴ�.
	 * Vector�� ����ȭ, ArrayList�� �񵿱�ȭ
	 * ex. ArrayList, LinkedLst, Vector
	 * 
	 * Map
	 * Key&Value�� ���¸� ������, Ű���� �Է��ϸ� value�� ȹ���Ѵ�. ������ ������ ������� �ʰ� ������ �����͸� key�� �� �� ����.
	 * HashMap - ������ ����� ����ȭ X(synchronizedŰ�������), ó�� �ӵ��� ����
	 * HashTable - ����� ����ȭ O(synchronizedŰ��������), ó�� �ӵ� ��������.
	 * ### synchronized : multi-thread�� ���� ���ٵǴ� ���� ���´�.
	 * �޼ҵ忡 synchronized�� �ɸ� �� �Լ��� ���Ե� �ش� ��ü�� lock�� �Ŵ� ��.
	 * ex. HashMap, HashTable
	 * 
	 * Set
	 * �ߺ������͸� ������� �ʴ´�. �������� ������ ���� iterator�� ����.
	 * ex. HashSet
	 * 
	 * HashMap�� ����ϴ� ����?(ArrayList vs HashMap)
	 * #ArrayList�� ������ �˻��ϱ� ���� ����ڰ� ��� index�� �˾ƾ� �Ѵ�.
	 * index�� �˰� �ִٸ� ArrayList�� HashMap���� ������!
	 * #HashMap�� key���� Object��ü�� ������ �ִ�. �� key�� �ٷ� ���ϴ� ������ ����.
	 * �˻� �ɷ��� Ź���ϴٰ� �� �� �ִ�. 
	 */
	
	/* static Ű���忡 ����
	 * 
	 * Ŭ������ ������ ��, ��� �ν��Ͻ��� ���������� ����ؾ��ϴ� �Ϳ� static�� ���δ�.
	 * �� �ν��Ͻ��� �������̱� ������, ���� �ٸ� ���� �����ϴµ�, ��� �ν��Ͻ��� ���� ���� �����ؾ� �ϴ� ��쿡 static�� ���δ�.
	 * 
	 * static�� ���� ��������� �ν��Ͻ��� �������� �ʾƵ� ����� �� �ִ�.
	 * �ֳ��ϸ�, static�� ���� ��������� Ŭ������ �޸𸮿� �ö� �� �ڵ������� �����ȴ�.
	 * 
	 * static�� ���� �޼���� �ν��Ͻ� ������ ����� �� ����. �ֳ��ϸ�, �ν��Ͻ� ������ �ν��Ͻ��� �����Ǿ��� ���� �����ϴµ�,
	 * static�� ���� �޼���� �ν��Ͻ� ���� ���� ȣ���� �� �ֱ� ������, static�� �ν��Ͻ� ������ ����� �� �ν��Ͻ��� �̹� �����Ǿ�����
	 * �ƴ����� �� �� ����.
	 * 
	 * �ڽ�(�� �ν��Ͻ�)���� ���� �����ؾ��Ѵٸ� �ν��Ͻ� ������ ����,
	 * ��ΰ� ���� ���� �����ؾ� �Ѵٸ� Ŭ���� ����(static ����)�� �������!
	 * static ������ ���� ȣ��ð��� ª�� ������ �ν��Ͻ� �޼ҵ�ȿ��� ������ �ʴ´ٸ� static���� �����ϴ� ���� ��õ�Ѵ�!
	 * */
	static HashMap<Integer, Student>list =new HashMap<Integer, Student>();
	//HashMap�� ��� �뵵 : �л� ���� ����
	static HashSet<Integer> list_search=new HashSet<Integer>();
	//HashSet�� ��� �뵵 : ã�ƾ� �ϴ� �л� ���� ����(ã�� ���Ѵٸ� �߰��� �� ���� ��� search)
	
	/* ���⼭ HashSet�� ����ϴ� ����?
	 * �ռ� �� �� ó�� ArrayList�� ����ߴٸ� �ߺ��� ������ ����ؼ� ������ ��. �ߺ��� ������ ��� ����Ǹ� Thread�� ����ؼ� �ߺ��� ���� ã�� ���̴�.
	 * ������, HashSet�� Set�迭�� Ư���� �ߺ� �����͸� ������� ����. ���� HashSet�� ����ϰ� �ȴ�.
	 * */
	
	public static void main(String[] args) {
		System.out.println("DB TERM PROJECT");
		System.out.println("1: ��ȸ�ϱ�");
		System.out.println("2: �߰��ϱ�");
		while(true) {//����ؼ� ��ȸ, �߰�. ������� �ʴ´�
			Scanner sc=new Scanner(System.in);
			/* Scanner vs BufferedReader
			 * 
			 * Scanner
			 * InputStreamReader: character�� �Է�
			 * BufferedReader: ����ڰ� ��û�� �� ���� �Ź� �о���� ���� �ƴ�, ������ ������� �� ���� �о�� �� ���ۿ� ����
			 * ����ڰ� �䱸�� �� ���ۿ��� �о�´�. �ӵ��� ���ǰ�, �ð��� ���ϸ� ���δ�.
			 * ���ڿ����� �о�´�. parsing �ʿ�
			 * 
			 * BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
			 * br.readLine();
			 * br.read();
			 * 
			 * */
			
			System.out.println("�Է�: ");
			
			int number=sc.nextInt();//��ȸ, �Ǵ� �߰��� �����Ѵ�	
			
			//////////////////
			/* thread Ŭ����
			 * 
			 * �ڹٿ��� �����带 �ۼ��ϴ� ������� 2������ �ִ�. 
			 * 1. thread Ŭ��������, run()�޼��带 override���־� ����Ѵ�.
			 * public class MyThread extends Thread
			 * 
			 * 2. runnable �������̽��� �����Ѵ�. 
			 * public class MyRunnable implements Runnable
			 * Runnable�������̽��� ���, ������ �޼ҵ尡 run()�ϳ����� �Լ��� �������̽��̴�.
			 * 
			 * 1, 2�� �������� ���� ����� �ٸ���.
			 * 1: �ش� ��ü���� start() �޼��带 ���� ȣ���Ѵ�.
			 * Thread t=new MyThread();
			 * t.start();
			 * 2: �����ڸ� ���� ������ Thread��ü�� ������ �Ŀ� start() �޼��带 ȣ���Ѵ�.
			 * Runnable r=new MyRunnable();
			 * Thread t1=new Thread(r);
			 * t1.start();
			 * 
			 * �׷� 1�� �� �����ϴϱ� 1�� ���� ���� �ʳ���? (Thread vs Runnable)
			 * Java������ ���� ����� ������� �ʴ´�. ���� Thread Ŭ������ Ȯ���ϴ� Ŭ������  ���� Ŭ������ ��ӹ��� �� ����. 
			 * ������, Runnable �������̽��� �ٸ� �������̽��� ������ �� �ְ�, �ٸ� Ŭ������ ��ӹ��� �� �ִ�.
			 * ���� Ȯ�强�� �߿��ϴٸ� Runnable�� ����Ѵ�!
			 * */
			
			Runnable runnable=()->{//���ٸ� ����ϸ� runnable�� �� �����ϰ� �����Ѵ�.
				try {
					Thread.sleep(10000);//10�ʿ� �� ��
					if(list!=null & list_search!=null) {//�� �� null�̶��, Ȯ���� �ʿ䰡 ����!
						Iterator<Integer> it=list_search.iterator();//iterator ����, iterator��ü�� �޾Ƽ� for���� ������(hasNext)
						//list_search�� ã�ƾ� �� �ֵ�
						while(it.hasNext()) {
							int check=it.next();//ã�ƾ� �� key
							if(list.containsKey(check)) {//ã�ƾ� �� key�� �߰��Ǿ� �����͸� ã�� ���
								System.out.println("�ش� �����͸� ã�ҽ��ϴ�");
								System.out.println("�л� �̸�: "+list.get(check).getName()+" ");
								System.out.println("�г�: "+list.get(check).getGrade()+" ");
								System.out.println("�ּ�: "+list.get(check).getAddress()+" ");
								System.out.println("��ȭ��ȣ"+list.get(check).getNumber());
								list_search.remove(check);//ã������ �����Ѵ�.
							}
							
						}
					}
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			};
			Thread thread=new Thread(runnable);
			thread.start();
			//////////////////
			
			sc.nextLine();//�� ģ���� ����� ��ĳ�ʿ� \n�� ���� �ʴ´�.

			if(number==1) {//��ȸ�� �������� ��
				//��ȸ�ϱ�
				//��ȭ��ȣ �Է� �ޱ�, ��ȭ��ȣ�� Ű���̱� ������ 
				int input=sc.nextInt();
				
				//Ű �� ã��
				if(list.containsKey(input)) {//�ش� Ű�� ������ �ִ��� ã�´�. HashMap�� �޼ҵ�, ������ �ִٸ� true�� ��ȯ�Ѵ�.
					System.out.println("�ش� �����͸� ã�ҽ��ϴ�.");
					System.out.println("�л� �̸�: "+list.get(input).getName());
					System.out.println("�г�: "+list.get(input).getGrade());
					System.out.println("�ּ�: "+list.get(input).getAddress());
					System.out.println("��ȭ��ȣ: "+list.get(input).getNumber());//�ش� ��ȣ�� ����Ѵ�
				}else {
					System.out.println("�ش� �����͸� ã�� �� �����ϴ�");
					list_search.add(input);//�����͸� ã�� �� ���� ��쿡�� list_search�� �߰���Ų��. �̸� ã�Ƴ��� �Ѵٴ� ��! ���߿� �߰��Ǿ��� �� �ٸ� thread���� ã�Ƽ� ������ش�.
				}
				
			}
			else if(number==2) {
				//�߰��ϱ�
				//�л� ���� �Է�
				System.out.print("�߰��ϱ�: ");
				String input=sc.nextLine();
				StringTokenizer st=new StringTokenizer(input);//string tokenizer�� �̿��Ͽ� input�� ������. �� �ٿ� �Է��ϱ� ������
				String student[]=new String[4];//������ ������ �����ص� ��
				int i=0;
				while(st.hasMoreTokens()) {
					student[i]=(String)st.nextToken();//����
					i++;
				}
				if(list.containsKey(Integer.parseInt(student[3]))) {
					System.out.println("�����Ͱ� �̹� �����մϴ�.");
					continue;//�����Ͱ� �̹� �����Ѵٸ�, ��ü�� �������� �ʰ�(�������� �ʰ�) continue
				}
				
				//student ��ü ����
				Student student_info=new Student(student);
				//list �߰�
				list.put(Integer.parseInt(student[3]), student_info);//list�� ������ �߰���Ų��.
				
				System.out.println("�߰� �Ϸ�");
			}
			else {
				System.out.println("bye");
				break;
			}
		}
	}
	
}
