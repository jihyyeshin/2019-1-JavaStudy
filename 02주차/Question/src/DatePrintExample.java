/*11�� 13��*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");		
		String nowString=sdf.format(now);
		System.out.println(nowString);	
	}
}