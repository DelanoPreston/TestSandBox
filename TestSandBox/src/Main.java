

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		try{
		JFrame frame = new JFrame();
		MyPanel gamePanel = new MyPanel();
		frame.setSize(850, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.add(gamePanel);
		frame.setVisible(true);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
