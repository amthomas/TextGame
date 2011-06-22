import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		frame.setVisible(true);
	}
	
	// password listener class... why does it still want me to implement ActionListener?
	class AL implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			if (stage.getLevelNum() == 15) {
				String password = "2965";
				JPasswordField input = (JPasswordField) e.getSource();
				char[] passyArray = input.getPassword();
				String passy = new String(passyArray);
			
				if (passy.equals(password)){
					JOptionPane.showMessageDialog(null, "Computer: Access granted");
					frame.getContentPane().remove(passwordField);
					frame.getContentPane().add(BorderLayout.SOUTH, button);
					stage.levelCheck();
					refresh();
				}
				else {
					JOptionPane.showMessageDialog(null, "Computer: Access denied");
				}
			}
		}
	}

	public void actionPerformed(ActionEvent ev) {
		if (stage.getLevelNum() < 15) {
			stage.levelCheck();
			refresh();
		}
		if (stage.getLevelNum() == 15) {
			frame.getContentPane().remove(button);
			passwordField = new JPasswordField(4);
			frame.getContentPane().add(BorderLayout.SOUTH, passwordField);
			passwordField.addActionListener(new AL());
		}
		if (stage.getLevelNum() > 15) {
			
//			button = new JButton("Start");
//			button.addActionListener(this);
			
			stage.levelCheck();
			refresh();
		}
	}
		
	
	
	@SuppressWarnings("deprecation")
	public void refresh() {
		String buttonLabel = stage.getButtonLabel();
		button.setLabel(buttonLabel);
		text.append(stage.getLevelText());
	}		

	


//	public void actionPerformed(ActionEvent e) {

//	}
	
}
