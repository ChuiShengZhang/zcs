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
 * �����ҷ����
 */

/*
 * ������߳�
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
			throw new RuntimeException("��ʼ��bufIn/bufOutʧ��");
		}
	}
	public void run(){
		//��ȡSocket��������
		try {
			String name = socket.getInetAddress().getHostAddress();
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line=bufIn.readLine();
			System.out.println("�յ��ͻ�����Ϣ��"+line);
			String[] msg = line.split("#");
			if(msg[0].equals("ADD")){
				sendMessage(name+"������");
			}else if(msg[0].equals("del")){
				ChatServer.clients.remove(msg[1]);
				sendMessage(name+"������");
			}else if(msg[0].equals("ALL")){
				sendMessage(new String("��"+name+"��"+msg[1]));
			}else if(msg[0].equals("PRI")){
				for(String key : ChatServer.clients.keySet()){
					ServerThread st = clients.get(key);
					if(st.socket.getInetAddress().getHostAddress().equals(msg[1])){
						st.getBufOut().write(name+"����˵"+msg[2]);
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
				throw new RuntimeException("��Ϣ����ʧ��");
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
				//��������ˣ�����8888�˿�
				ServerSocket server = new ServerSocket(11122);
				System.out.println("���������.........");
				//��ȡ�ͻ��˵�Socket
				System.out.println("�ȴ�������.........");
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress()+"���ӳɹ�..........");
				clients = new HashMap<String,ServerThread>();
			
				//�����߳�
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
