
public class MovieThread extends Thread {
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("�������� ����մϴ�.");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {

		}
	}
}
