package PipedStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*�ܵ�����io���漰�����̵߳�������
 * 
 * PipedInputStream �ܵ���ȡ��
 * PipedOutputStream �ܵ�д����
 * 
 * ���ڹ��췽��ʱ����������������Ҳ����connect()��������
 * 
 */
//��ȡ�߳�
class ReadThread implements Runnable {
	private PipedInputStream pis;

	public ReadThread(PipedInputStream pis) {
		this.pis = pis;
	}

	public void run() {
		int len = 0;
		try {
			while ((len = pis.read()) != -1) {
				System.out.println((char) len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// д���߳�
class WriteThread extends Thread {
	private PipedOutputStream pos;

	WriteThread(PipedOutputStream pos) {
		this.pos = pos;
	}

	public void run() {
		try {
			pos.write("PipedDemo".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class PipedStreamDemo {
	public static void main(String[] args) throws IOException {
		// ��һ�ִ����ܵ���
		// PipedInputStream pis = new PipedInputStream();
		// PipedOutputStream pos = new PipedOutputStream(pis);
		// �ڶ���
		PipedInputStream pis1 = new PipedInputStream();
		PipedOutputStream pos1 = new PipedOutputStream();
		pis1.connect(pos1);// �������������������

		// �������߳�
		ReadThread read = new ReadThread(pis1);
		Thread t = new Thread(read);
		t.start();

		// ����д�߳�
		WriteThread write = new WriteThread(pos1);
		write.start();

	}
}
