package TcpDemo;

import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP 面向连接，必须连接上才能进行数据的传输
 * 
 * TCP 分为客户端 Socket
 * 			服务端 ServerSocket
 */
public class TcpClientDemo {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1",10000);
		OutputStream out = s.getOutputStream();
		byte[] bytes = "你好，服务端，我是客户端".getBytes();
		out.write(bytes);
		s.close();
	}
}
