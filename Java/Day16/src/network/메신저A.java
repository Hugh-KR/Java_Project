package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.soap.SOAPException;

public class 메신저A extends JFrame {
	DatagramSocket socket;
	JTextArea list; // 채팅 내용 리스트
	JTextField input; // 채팅 내용 입력

	public 메신저A() throws Exception {
		// 받는 소켓 만들어주자.
		socket = new DatagramSocket(7777);
		setTitle("메신저A");
		setSize(500, 500);
		list = new JTextArea();
		input = new JTextField();

		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);

		Font font = new Font("궁서", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);

		// 배경색
		list.setBackground(Color.green);
		input.setBackground(Color.yellow);

		// 글자색
		list.setForeground(Color.blue);
		input.setForeground(Color.red);

		// list은 수정불가
		list.setEditable(false);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				list.append("나>> " + input.getText() + "\n");
				
				try {
					DatagramSocket socket = new DatagramSocket();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					String str = input.getText();
					byte[] data = str.getBytes();
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5555);
					socket.send(packet);
					socket.close();
					
					input.setText("");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});


		setVisible(true);

	}

	
	public void process() throws Exception {
		while (true) {
			//DatagramSocket socket = new DatagramSocket(7100);
			byte[] data = new byte[256];
			
			DatagramPacket packet = new DatagramPacket(data, data.length);
			System.out.println("udp 받을 준비중..");
			socket.receive(packet);
			//System.out.println(new String(data));
			list.append("너>> " + new String(data) + "\n");
			//socket.close();
		}
	}
	public static void main(String[] args) throws Exception {
		메신저A name = new 메신저A();
		name.process();
	}
}