package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장예매시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550, 750);

		// 레이아웃 부품 지정
		// 물처럼 흐르듯 왼쪽부터 하나씩 순서대로 붙여주는 배치 부품을 만들어서.
		// f에 설정
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

//		JButton b1 = new JButton("좌석1");
//		JButton b2 = new JButton("좌석2");
//		JButton b3 = new JButton("좌석3");
//
//		f.add(b1);
//		f.add(b2);
//		f.add(b3);
		int[] seat = new int[500];
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton(i + "");
			f.add(b);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 버튼 위에 있는 글자를 가져다 준다.
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false); // 다시 안눌러짐.
					b.setBackground(Color.red); // 맥은 색이 안들어가.
					int index = Integer.parseInt(s);
					
					seat[index] = 1; // 예약완료.
					
					int count = 0;
					String seatNo ="";
					
					for(int i = 0; i < seat.length; i++) {
						if (seat[i] == 1) {
							count++;
							seatNo = seatNo + " " + i;
						}
					}
					// 한자리당 금액이 13000원, 결제금액을 출력해 주세요.
					
					JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개.");
					JOptionPane.showMessageDialog(f, "당신이 예매한 좌석번호는 " + seatNo);
					JOptionPane.showMessageDialog(f, "결제금액은 " + count*13000 + "원.");
					
				}
			});
		}

		// 맨 끝으로가야 위에가 다 보임.
		f.setVisible(true);

	}

}
