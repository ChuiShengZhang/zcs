package TcpDemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerSocketDemo {
	public static void main(String[] args) throws Exception {
		
		//创建服务端服务
		ServerSocket ss = new ServerSocket(10000);
		
		//通过accept方法拿到与服务端连接的客户端对象
		Socket s = ss.accept();//阻塞式方法
		
		//获取客户端IP、
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");
		InputStream in = s.getInputStream();
		byte[] bytes = new byte[1024];
		int len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		//向客户端返回消息
		OutputStream out = s.getOutputStream();
		out.write("服务端收到".getBytes());
	}
}
