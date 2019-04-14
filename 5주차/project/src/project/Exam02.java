/*
 *   1. �Ʒ��� �������� �ܼ�â�� �Է��մϴ�.
 *   ���� - �̸�:�ڹ�:SQL:Jdbc
 *   
 *   ------------------------------
 *   ����:98:66:78
 *   ������:88:56:88
 *   �ڼ���:78:86:58
 *   ------------------------------
 * 
 *   �Ʒ��� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 *   
 *   ���� ���� 
 *   - �ڹ� : 70�� �̻�
 *   - SQL  : 80�� �̻�
 *   - Jdbc : 80�� �̻�
 *   
 *   ������� ��� ��� ����
 *   
 *   ----------------------------------------
 *   �л�����
 *   ----------------------------------------
 *   ���� : ����(242��), �ڹ�(98��-����), SQL(66��-�̼���), Jdbc(78��-�̼���)
 *   �ڼ��� : ����(222��), �ڹ�(78��-����), SQL(86��-����), Jdbc(58��-�̼���)
 *   �̱�� : ����(232��), �ڹ�(88��-����), SQL(56��-�̼���), Jdbc(88��-����)
 *   ----------------------------------------
 */
package project;

import java.util.*;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> pl = new ArrayList<Student>();
		String bufStr;
		System.out.println("������ �Է��ϼ���");
		for (int i = 0; i < 3; i++) {
			bufStr = sc.nextLine();
			pl.add(new Student(bufStr.split(":")[0], Integer.parseInt(bufStr.split(":")[1]),
					Integer.parseInt(bufStr.split(":")[2]), Integer.parseInt(bufStr.split(":")[3])));
		}
		// Collections.sort(pl);
		for (int i = 0; i < 3; i++) {
			System.out.println(pl.get(i).getName()+" : ����("+pl.get(i).getScore()+"��), �ڹ�("+pl.get(i).getjScore()+"��");
		}
	}
}

class Student implements Comparable<String> {
	private String name;
	private int jScore;
	private int sScore;
	private int jdScore;
	private int score;

	public String getName() {
		return name;
	}

	public int getjScore() {
		return jScore;
	}

	public int getsScore() {
		return sScore;
	}

	public int getJdScore() {
		return jdScore;
	}

	public int getScore() {
		return score;
	}

	Student(String name, int jScore, int sScore, int jdScore) {
		this.name = name;
		this.jScore = jScore;
		this.jdScore = jdScore;
		this.sScore = sScore;
		this.score = jScore + jdScore + sScore;
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
}