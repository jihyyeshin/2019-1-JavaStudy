import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Examples {
	public static void main(String[] args) {
		Students[] stuArr = {
			new Students("���ڹ�", 3, 300),
			new Students("���ڹ�", 1, 200),
			new Students("���ڹ�", 2, 100),
			new Students("���ڹ�", 2, 150),
			new Students("���ڹ�", 1, 200),
			new Students("���ڹ�", 3, 290),
			new Students("���ڹ�", 3, 180)	
		};

		// �л� �̸��� �̾Ƽ� List<String>�� ����
		List<String> names = Stream.of(stuArr).map(Students::getName)
									          .collect(Collectors.toList());
		System.out.println(names);

		// ��Ʈ���� �迭�� ��ȯ
		Students[] stuArr2 = Stream.of(stuArr).toArray(Students[]::new);

		for(Students s : stuArr2)
			System.out.println(s);

		// ��Ʈ���� Map<String, Student>�� ��ȯ. �л� �̸��� key 
		Map<String,Students> stuMap = Stream.of(stuArr)
						                   .collect(Collectors.toMap(s->s.getName(), p->p));
		for(String name : stuMap.keySet())
			System.out.println(name +"-"+stuMap.get(name));
		
		long count = Stream.of(stuArr).collect(counting());
		long totalScore = Stream.of(stuArr)
                                .collect(summingInt(Students::getTotalScore));
		System.out.println("count="+count);
		System.out.println("totalScore="+totalScore);

		totalScore = Stream.of(stuArr)
			               .collect(reducing(0, Students::getTotalScore, Integer::sum));
		System.out.println("totalScore="+totalScore);

		Optional<Students> topStudent = Stream.of(stuArr)
		                                     .collect(maxBy(Comparator.comparingInt(Students::getTotalScore)));
		System.out.println("topStudent="+topStudent.get());

		IntSummaryStatistics stat = Stream.of(stuArr)
					                      .collect(summarizingInt(Students::getTotalScore));
		System.out.println(stat);

		String stuNames = Stream.of(stuArr)
							    .map(Students::getName)
							    .collect(joining(",", "{", "}"));
		System.out.println(stuNames);
	}
}


class Students implements Comparable<Students> {
	String name;
	int ban;
	int totalScore;

	Students(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
	   return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
	}

	String getName() { return name;}
	int getBan() { return ban;}
	int getTotalScore() { return totalScore;}

	public int compareTo(Students s) {
		return s.totalScore - this.totalScore;
	}
}
