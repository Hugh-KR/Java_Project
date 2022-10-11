package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// UDP받는 부분부터 먼저 실핼시켜야 함.
		// UDP용 소
		
		DatagramSocket socket = new DatagramSocket(7100);
		byte[] data = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("udp 받을 준비중..");
		socket.receive(packet);
		System.out.println(new String(data));
		socket.close();

	}

}
