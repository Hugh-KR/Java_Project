package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9200);
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중.");
		int count = 0;
		
		while(true) {
			Socket socket = server.accept();
			count++;
			System.out.println("클라이언트 연결됨.>> " + count + "접속");
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			String date = String.valueOf(new Date()); 
			out.print(date);
			out.close();
			socket.close();
		}
	}

}
