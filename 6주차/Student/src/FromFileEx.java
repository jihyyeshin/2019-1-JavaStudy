import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.stream.Stream;

//���Ϸκ��� ��Ʈ�����
public class FromFileEx {
	public static void main(String[] args) throws IOException{
		Path path=Paths.get("C:\\Users\\tlsjh\\OneDrive\\����\\2019-1-Javastudy\\6����\\Student\\src\\linedata.txt");
		Stream<String> stream;
		//Files.lines()�޼ҵ� ���
		stream=Files.lines(path, Charset.defaultCharset());
		//stream.forEach(System.out::println);
		stream.forEach(s->System.out.println(s));//���� �ǹ̷� ���� �� �ִ�!
		System.out.println();
		
		//BufferedReader�� lines() �޼ҵ� �̿�
		File file=path.toFile();
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		stream=br.lines();
		stream.forEach(System.out :: println);
		
		//������ lines�޼ҵ带 ���� txt�� ������ ��Ʈ���� ���� �� ������ �а� �ֿܼ� ���
	}
}
