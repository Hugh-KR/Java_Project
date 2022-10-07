package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 주식크롤링 {
	private static JTextField t1;

	public static void main(String[] args) {
		
		String[] code = {"005360", "005930", "068270"};
		String[] company = {"모나미", "삼성전자", "셀트리온"};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(300,600);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("CODE:");
		l1.setForeground(Color.RED);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(117, 212, 61, 16);
		f.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(85, 240, 130, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel tl1 = new JLabel("이곳에 정보가 나타납니다.");
		tl1.setForeground(Color.WHITE);
		tl1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		tl1.setHorizontalAlignment(SwingConstants.CENTER);
		tl1.setBackground(Color.WHITE);
		tl1.setBounds(48, 410, 204, 118);
		f.getContentPane().add(tl1);
		
		JLabel tl2 = new JLabel("");
		tl2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		tl2.setForeground(Color.WHITE);
		tl2.setHorizontalAlignment(SwingConstants.CENTER);
		tl2.setBounds(17, 343, 265, 55);
		f.getContentPane().add(tl2);
		
		
		JButton b1 = new JButton("모 나 미");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[0]).get();
					Elements elist = doc.select("span.blind");
					System.out.println(company[0]);
					System.out.println("----------");
					String today = elist.get(12).text();
					String yesterday = elist.get(15).text();
					String high = elist.get(16).text();
					tl1.setText("<html>" + "오늘: " + today + "<br>" + "어제: " + yesterday + "<br>" + "고가: " + high + "</html>");
					System.out.println();
					tl2.setText("");
				} catch (Exception r) {
					// TODO: handle exception
					
				}

				
			}
		});
		b1.setBounds(48, 35, 200, 30);
		f.getContentPane().add(b1);
		
		
		
		JButton b2 = new JButton("삼성전자");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[1]).get();
					Elements elist = doc.select("span.blind");
					System.out.println(company[1]);
					System.out.println("----------");
					String today = elist.get(12).text();
					String yesterday = elist.get(15).text();
					String high = elist.get(16).text();
					tl1.setText("<html>" + "오늘: " + today + "<br>" + "어제: " + yesterday + "<br>" + "고가: " + high + "</html>");
					System.out.println();
					tl2.setText("");
				} catch (Exception r) {
					// TODO: handle exception
					
				}
			}
		});
		b2.setBounds(48, 91, 200, 30);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("셀트리온");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[2]).get();
					Elements elist = doc.select("span.blind");
					System.out.println(company[2]);
					System.out.println("----------");
					String today = elist.get(12).text();
					String yesterday = elist.get(15).text();
					String high = elist.get(16).text();
					tl1.setText("<html>" + "오늘: " + today + "<br>" + "어제: " + yesterday + "<br>" + "고가: " + high + "</html>");
					System.out.println();
					tl2.setText("");
				} catch (Exception r) {
					// TODO: handle exception
					
				}
			}
		});
		b3.setBounds(48, 147, 200, 30);
		f.getContentPane().add(b3);
		
		JButton start_btn = new JButton("크롤링 시작");
		start_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + t11).get();
					Elements elist = doc.select("span.blind");
					String today = elist.get(12).text();
					String yesterday = elist.get(15).text();
					String high = elist.get(16).text();
					tl1.setText("<html>" + "오늘: " + today + "<br>" + "어제: " + yesterday + "<br>" + "고가: " + high + "</html>");
					System.out.println();
				} catch (Exception r) {
					// TODO: handle exception
					
				}
				
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + t11).get();
					Elements elist = doc.select(".new_totalinfo").select(".blind");
					String name = elist.get(10).text();
					tl2.setText(name);
					System.out.println();
				} catch (Exception r) {
					// TODO: handle exception
					
				}
				
			}
		});
		start_btn.setBackground(Color.CYAN);
		start_btn.setBounds(95, 278, 110, 30);
		f.getContentPane().add(start_btn);
		f.setVisible(true);
	}
}
