import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class GameGUI implements ActionListener{

	JTextArea text;
	JButton button;
	JPasswordField passwordField;
	JLabel label;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	Level stage = new Level(1, "", "");
		
	public void initialize(){
		text = new JTextArea(20,30);
		text.setLineWrap(true);
		text.setEditable(false);
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		
		button = new JButton("Start");
		button.addActionListener(this);
		
		frame.setTitle("The Wanderer");
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(380,400);
		frame.setResizable(false);
	}
	
	public void actionPerformed(ActionEvent ev) {
		
		
		if (stage.getLevelNum() == 15) {
//			text = new JTextArea(20,30);
//			text.setLineWrap(true);
//			text.setEditable(false);
//			JScrollPane scroller = new JScrollPane(text);
//			scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//			scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//			panel.add(scroller);
//			
//			
//			
//			frame.setTitle("The Wanderer");
//			frame.getContentPane().add(BorderLayout.CENTER, panel);
//			frame.getContentPane().add(BorderLayout.SOUTH, button);
//			frame.setSize(380,400);
//			frame.setResizable(false);
//			frame.setVisible(true);			
			
			
			String okay = "ok";
			frame.getContentPane().remove(button);
			passwordField = new JPasswordField(4);
			passwordField.setActionCommand("Okay");
			passwordField.addActionListener(this);
			label = new JLabel("Enter the password: ");
			label.setLabelFor(passwordField);
			
			panel.add(passwordField);
			
			
		}
		
		
		
		refresh();
		stage.levelCheck();
	}
	
	@SuppressWarnings("deprecation")
	public void refresh() {
		String buttonLabel = stage.getButtonLabel();
		button.setLabel(buttonLabel);
		

		text.append(stage.getLevelText());
	}
	
//	public void actionPerformed(ActionEvent e) {
//		String cmd = "e.getActionCommand();"
//		
//			if (OK.equals(cmd)) { //process the password
//				char[] input = passwordField.getpassword();
//				
//			}
//	}
	
}
