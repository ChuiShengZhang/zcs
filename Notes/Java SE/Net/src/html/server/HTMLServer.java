package html.server;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HTMLServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9090);
		
		Socket socket=server.accept();
		
		InputStream in = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		out.println("<font color='blue' size='8'>接收成功</font>");
		
		socket.close();
		server.close();

	}

}
