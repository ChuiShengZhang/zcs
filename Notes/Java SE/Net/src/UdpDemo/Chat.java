package UdpDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP发送端线程
class SendThread implements Runnable{
	private DatagramSocket ds;
	public SendThread(DatagramSocket ds){
		this.ds = ds;
	}
	public void run(){
//		while(true){
			try {
				BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
				String line = null;
				while((line = bufr.readLine())!=null){
					if("886".equals(line)){
						ds.close();
						break;
					}
					byte[] bytes = line.getBytes();
					DatagramPacket dp = new DatagramPacket(bytes,bytes.length,InetAddress.getByName("127.0.0.1"),6640);
					ds.send(dp);
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
//		}
	}
}

//接收端线程
class ReceThread implements Runnable{
	private DatagramSocket ds;
	public ReceThread(DatagramSocket ds){
		this.ds = ds;
	}
	public void run(){
		while(true){
			byte[] bytes = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
			try {
				ds.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				String data =new String(dp.getData(),0,dp.getLength());
				System.out.println(ip+":"+data+"---"+dp.getPort());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Chat {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket sendSocket = new DatagramSocket();
		DatagramSocket receSocket = new DatagramSocket(6640);
		
		new Thread(new SendThread(sendSocket)).start();
		new Thread(new ReceThread(receSocket)).start();
	}
}
