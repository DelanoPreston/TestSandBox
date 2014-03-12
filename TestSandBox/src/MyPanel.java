import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
	private static final long serialVersionUID = 3426940946811133635L;
	
	public MyPanel(){
		createButtons();
	}
	
	private void createButtons(){
		this.setLayout(new CustomLayout(5));
		this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		for(int i = 0; i < 3; i++){
			JButton temp = new JButton("num " + (i + 1));
			temp.setPreferredSize(new Dimension(64, 64));
			add(temp);
		}
	}
}
