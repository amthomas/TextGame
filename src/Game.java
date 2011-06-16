import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game implements ActionListener {

	JTextArea text;
	private int levelNum;
	private String levelText;
		
	// creates a new game
	public static void main (String[] args) {
		Game gui = new Game();
		
		
		
		
		int levelNum = 1;
		String levelText = "test";
		Level stage = new Level(levelNum, levelText);
		stage.refresh();
		
		gui.initialize();
		
	}
	
	public void initialize() {
		// initializes the window
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Okay");
		button.addActionListener(this);
		text = new JTextArea(20,30);
		text.setLineWrap(true);
		text.setEditable(false);
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(380,400);
		frame.setVisible(true);
		
		text.append(levelText + levelNum + " \n");
		
	}
	
	public void actionPerformed(ActionEvent ev) {
		text.append("button clicked \n");
	}
	
}
