package PipedStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*管道流：io中涉及到多线程的流对象。
 * 
 * PipedInputStream 管道读取流
 * PipedOutputStream 管道写入流
 * 
 * 可在构造方法时将两者链接起来，也可用connect()方法链接
 * 
 */
//读取线程
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

// 写入线程
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
		// 第一种创建管道流
		// PipedInputStream pis = new PipedInputStream();
		// PipedOutputStream pos = new PipedOutputStream(pis);
		// 第二种
		PipedInputStream pis1 = new PipedInputStream();
		PipedOutputStream pos1 = new PipedOutputStream();
		pis1.connect(pos1);// 将输入输出流链接起来

		// 开启读线程
		ReadThread read = new ReadThread(pis1);
		Thread t = new Thread(read);
		t.start();

		// 开启写线程
		WriteThread write = new WriteThread(pos1);
		write.start();

	}
}
