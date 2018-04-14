package TcpTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UpLoadFileServer {
	public static void main(String[] args) throws IOException {
		
		//����ServerSocket����
		ServerSocket ss = new ServerSocket(10087);
		
		System.out.println("���������");
		
		//��ȡ����˶���
		Socket s = ss.accept();
		
		//��ȡ�ͻ���������
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//��ȡ�ͻ����ϴ����ļ�
		File file = new File("server.txt");
		BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
		String line = null;
		while((line = bufIn.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
		//��ȡ�ͻ��˵��������������Ϣ�ϴ��ɹ�
		BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bufOut.write("�ϴ��ɹ�");
		bufOut.newLine();
		bufOut.flush();
		
		bufw.close();
		s.close();
		ss.close();
	 }
}
