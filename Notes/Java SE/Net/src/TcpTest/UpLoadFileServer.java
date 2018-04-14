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
		
		//创建ServerSocket服务
		ServerSocket ss = new ServerSocket(10087);
		
		System.out.println("服务端启动");
		
		//获取服务端对象
		Socket s = ss.accept();
		
		//获取客户端输入流
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//获取客户端上传的文件
		File file = new File("server.txt");
		BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
		String line = null;
		while((line = bufIn.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
		//获取客户端的输出流，返回消息上传成功
		BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bufOut.write("上传成功");
		bufOut.newLine();
		bufOut.flush();
		
		bufw.close();
		s.close();
		ss.close();
	 }
}
