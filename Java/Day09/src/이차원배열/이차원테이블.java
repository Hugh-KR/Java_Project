package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 200);

		String[] header = { "컴퓨터", "영어", "수학", "체육" };
		String[][] contents = { 
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" },
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" },
				{ "1", "2", "3", "4" },
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" },
				{ "1", "2", "3", "4" },
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" },
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" }, 
				{ "1", "2", "3", "4" } 
				};

		contents[0][0] = "999";
		contents[7][1] = "999";
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);

		f.setVisible(true);
		
		//이중for문
		for (int i =0; i < contents.length; i++) {
			for (int j =0; j < contents[i].length; j++) {
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}

	}

}
