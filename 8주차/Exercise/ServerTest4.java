import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class ServerTest4 {

	   public static void main(String[] args) {
	      
	      SocketChannel socketChannel = null;
	      try {
	         //Ŭ���̾�Ʈ��  ����ip,5001��Ʈ ���� �����û (Blocking���)
	         

	         System.out.println("[���� ��û]");
	         
	         System.out.println("[���� ����]");
	         
	         
	         
	         
	         ByteBuffer byteBuffer = null;
	         Charset charset = Charset.forName("UTF-8");
	         //Ŭ���̾�Ʈ�� ������ ���� "Hello Server"�� ������.

	         
	         System.out.println("[������ ������ ����]");
	         
	         
	         
	         //������ ���� "Hello Client"�� Ŭ���̾�Ʈ�� ����

	         
	         
	         
	         System.out.println("[������ �ޱ� ����]:" + message);
	         
	      } catch(Exception e) {}
	      
	      if(socketChannel.isOpen()) {
	         try {
	            socketChannel.close();
	         } catch (IOException e1) {}
	      }
	   }

