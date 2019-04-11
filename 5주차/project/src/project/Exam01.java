/*
1. �Ʒ��� ������ �ܼ�â�� �Է¹޽��ϴ�!
------------------------------
������:89
�̻�ȭ:69
�̽���:77
������:90
�ֹ���:84
------------------------------

2. ���� �Ѹ��� ������ ǥ���ϴ� Player Ŭ������ �ۼ��մϴ�.(�̸�, ���ھ�)

3. �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ��մϴ�.

������� > 

���� ������
������   ����
-------------
������ ����  90��
������ ����  89��
�ֹ��� ����  84��
�̽��� ����  77��
�̻�ȭ ����  69��
-------------

 */
package project;

import java.util.*;
public class Exam01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Player> pl=new ArrayList<Player>();
		String bufStr;
		System.out.println("���� ������ �Է��ϼ���");
		for(int i=0;i<5;i++) {
			bufStr=sc.nextLine();
			pl.add(new Player(bufStr.split(":")[0], Integer.parseInt(bufStr.split(":")[1])));
		}
		Collections.sort(pl, new Comparator<Player>(){
			@Override
			public int compare(Player a, Player b) {
				if(a.getScore()>b.getScore())
					return -1;
				else if (a.getScore()<b.getScore())
					return 1;
				else
					return 0;
			}
		});
		
		System.out.println("-------------");
		for(int i=0;i<pl.size();i++) {
			//System.out.println(pl.get(i).getName()+" ���� "+pl.get(i).getScore()+"��");
			System.out.println(pl.get(i));
		}
		System.out.println("-------------");
	}
}


class Player{
	private String name;
	private int score;
	
	Player(String name, int score){
		this.name=name;
		this.score=score;
	}
	public void setName(String name) {
		this.name = name;
	}
	//toString�� Override, ����� �� �ϱ� ���ؼ�
	//println�� toString�� �ڵ����� ȣ��Ǳ� ������ Override
	@Override
	public String toString() {
		return name+" ���� "+score+"��";
	}
	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
}