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
 * 需求:客户端向服务端上上传一个文件，上传成功后，服务端返回上传成功回客户端
 */

public class UpLoadFileClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建Socket服务
		Socket s = new Socket("127.0.0.1", 10087);

		System.out.println("客户端启动");

		// 将要上传的文件封装成File对象
		File file = new File("D:\\Java程序\\Eclipse\\Net\\src\\UdpDemo\\Chat.java");

		// 获取Socker输出流
		if (file.exists()) {
			BufferedWriter bufout = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

			// 上传文件
			BufferedReader bufr = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = bufr.readLine()) != null) {
				bufout.write(line);
				bufout.newLine();
				bufout.flush();
			}
			s.shutdownOutput();

			// 接收状态消息

			BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String state = bufin.readLine();
			System.out.println(state);

			bufr.close();
			s.close();
		}
	}
}
