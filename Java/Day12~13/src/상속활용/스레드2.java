package 상속활용;

import java.util.Date;

public class 스레드2 extends Thread{
	스레드사용2 play = new 스레드사용2();
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			play.day.setText("시각 >> " + date);
   
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
