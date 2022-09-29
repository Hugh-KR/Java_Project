package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {
	// 전체영역에서 특정한 변수를 사용하려면.
	// 클래스 아래에 선언해야한다.
	static int start = 2; // 전역변수

	public static void main(String[] args) {
		// 영화제목.
		String[] title = { "인생은 아름다워", "정직한 후보2", "공조2: 인터네셔날", "짱구는 못말려", "늑대사냥" };
		// 포스터파일.
		String[] img = { "인생.jpeg", "정직.jpeg", "공조2.jpeg", "짱구.jpeg", "늑대.jpeg" };
		// 평점.
		double[] jumsu = { 99.9, 88.9, 77.9, 66.9, 55.9 };

		JFrame f = new JFrame();
		f.setSize(415, 430);

		JLabel top = new JLabel("공조2: 인터네셔날");
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);

		JLabel under = new JLabel("77.9점");
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);

		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					// <<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면,
					// 이곳에 넣어라.
					// 제목이 표시된 라벨에 제목을 변경해야 함.
					start--;
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					// 변경된 이미지 부품 다시 만들어야함.
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝 입니다.");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start < 4) {
					start++;
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					// 이미지 변
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝 입니다.");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);

	}

}
