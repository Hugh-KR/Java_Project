package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhost", 9200);
			System.out.println("클라이언트가 접속함." + i);
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = buffer.readLine();
			System.out.println("서버에서 받아온데이터는 >> " + data);
		}

	}

}
