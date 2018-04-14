package TcpTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * ����:�ͻ������������ϴ�һ���ļ����ϴ��ɹ��󣬷���˷����ϴ��ɹ��ؿͻ���
 */

public class UpLoadFileClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// ����Socket����
		Socket s = new Socket("127.0.0.1", 10087);

		System.out.println("�ͻ�������");

		// ��Ҫ�ϴ����ļ���װ��File����
		File file = new File("D:\\Java����\\Eclipse\\Net\\src\\UdpDemo\\Chat.java");

		// ��ȡSocker�����
		if (file.exists()) {
			BufferedWriter bufout = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

			// �ϴ��ļ�
			BufferedReader bufr = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = bufr.readLine()) != null) {
				bufout.write(line);
				bufout.newLine();
				bufout.flush();
			}
			s.shutdownOutput();

			// ����״̬��Ϣ

			BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String state = bufin.readLine();
			System.out.println(state);

			bufr.close();
			s.close();
		}
	}
}
