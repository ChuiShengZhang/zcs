package TcpDemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerSocketDemo {
	public static void main(String[] args) throws Exception {
		
		//��������˷���
		ServerSocket ss = new ServerSocket(10000);
		
		//ͨ��accept�����õ����������ӵĿͻ��˶���
		Socket s = ss.accept();//����ʽ����
		
		//��ȡ�ͻ���IP��
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");
		InputStream in = s.getInputStream();
		byte[] bytes = new byte[1024];
		int len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		//��ͻ��˷�����Ϣ
		OutputStream out = s.getOutputStream();
		out.write("������յ�".getBytes());
	}
}
