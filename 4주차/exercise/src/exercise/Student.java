package exercise;

/*
class ���� 
- �̸�, �г�, �ּ�, ��ȭ��ȣ ������� ���� 
- ��ȭ��ȣ�� int�������� �����Ѵ�. �ٸ� ��������� String ��ü�� ���� �Ѵ�.
- �������� ��� Ŭ���� �������� �� �� �ֵ��� ���� ������ �Ѵ�.
- ��� ���� ��� getter�� setter ����Լ� ���� 
*/
public class Student {
	private String name;
	private String grade;
	private String address;
	private int pnumber;
	Student(String name, String grade, String address, int pnumber){
		this.name=name;
		this.grade=grade;
		this.address=address;
		this.pnumber=pnumber;
	}
	/*getter, setter*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPnumber() {
		return pnumber;
	}
	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}
}
