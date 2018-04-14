package ChatRoom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/*
 * 聊天室服务端
 */

/*
 * 服务端线程
 */
class ServerThread extends Thread{
	private Socket socket;
	private HashMap<String ,ServerThread> clients;
	private BufferedReader bufIn;
	private BufferedWriter bufOut;
	private String name;
	public ServerThread(Socket socket,HashMap<String , ServerThread> clients){
		this.socket = socket;
		this.clients = clients;
		try {
//			BufferedReader bufOut= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = this.getBufIn().readLine();
//				name=bufOut.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clients.put(socket.getInetAddress().getHostAddress()+name, this);
		try{
			bufIn = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			bufOut = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
		}catch(Exception e){
			throw new RuntimeException("初始化bufIn/bufOut失败");
		}
	}
	public void run(){
		//获取Socket的输入流
		try {
			String name = socket.getInetAddress().getHostAddress();
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line=bufIn.readLine();
			System.out.println("收到客户端消息："+line);
			String[] msg = line.split("#");
			if(msg[0].equals("ADD")){
				sendMessage(name+"上线了");
			}else if(msg[0].equals("del")){
				ChatServer.clients.remove(msg[1]);
				sendMessage(name+"下线了");
			}else if(msg[0].equals("ALL")){
				sendMessage(new String("【"+name+"】"+msg[1]));
			}else if(msg[0].equals("PRI")){
				for(String key : ChatServer.clients.keySet()){
					ServerThread st = clients.get(key);
					if(st.socket.getInetAddress().getHostAddress().equals(msg[1])){
						st.getBufOut().write(name+"对你说"+msg[2]);
						st.getBufOut().newLine();
						st.getBufOut().flush();
					}
						
				}
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void sendMessage(String message){
		for(String key : clients.keySet()){
			ServerThread st = clients.get(key);
			try {
				st.getBufOut().write(message);
				st.getBufOut().newLine();
				st.getBufOut().flush();
			} catch (IOException e) {
				throw new RuntimeException("消息发送失败");
			}
		}
	}
	public BufferedReader getBufIn(){
		return this.bufIn;
	}
	public BufferedWriter getBufOut(){
		return this.bufOut;
	}
}
public class ChatServer {
	
	public static HashMap<String,ServerThread> clients;
	public static void main(String[] args) {
		
		try {
			while(true){
				//建立服务端，监听8888端口
				ServerSocket server = new ServerSocket(11122);
				System.out.println("服务端启动.........");
				//获取客户端的Socket
				System.out.println("等待链接中.........");
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress()+"链接成功..........");
				clients = new HashMap<String,ServerThread>();
			
				//启动线程
				new ServerThread(socket,clients).start();
				
//				socket.close();
				server.close();
			
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
