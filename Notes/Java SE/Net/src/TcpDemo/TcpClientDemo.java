package TcpDemo;

import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP �������ӣ����������ϲ��ܽ������ݵĴ���
 * 
 * TCP ��Ϊ�ͻ��� Socket
 * 			����� ServerSocket
 */
public class TcpClientDemo {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1",10000);
		OutputStream out = s.getOutputStream();
		byte[] bytes = "��ã�����ˣ����ǿͻ���".getBytes();
		out.write(bytes);
		s.close();
	}
}
