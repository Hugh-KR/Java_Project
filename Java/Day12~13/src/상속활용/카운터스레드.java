package 상속활용;

import javax.swing.JOptionPane;

public class 카운터스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("카운트 >> " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i==0) {
				JOptionPane.showMessageDialog(null, "사용시간 다 되었습니다. 퇴실 부탁드립니다.");
			}
		}
	}
}
