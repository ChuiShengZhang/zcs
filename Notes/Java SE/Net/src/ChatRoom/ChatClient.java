package ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 聊天室客户端
 */
public class ChatClient {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("127.0.0.1",11111);
			
			//发送消息
			//键盘录入
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			//socket输出流
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			String line = null;
			System.out.println("*****");
			while((line = bufr.readLine())!=null){
				System.out.println(line);
				out.println(line);
			}
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = bufIn.readLine();
			System.out.println(data);
//			bufr.close();
//			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
