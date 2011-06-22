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
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class GameGUI implements ActionListener{
	private static final String PASSWORD = "2965";
	JTextArea text;
	JButton button;
	JPasswordField passwordField;
	JLabel label;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textField;

	
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
		
		textField = new JTextField();
	}
	
	// password listener class... why does it still want me to implement ActionListener?
	class AL implements ActionListener{ 
		

		public void actionPerformed(ActionEvent e) {
			if (stage.getLevelNum() == 15) {
				String password = PASSWORD;
				JPasswordField input = (JPasswordField) e.getSource();
				char[] passyArray = input.getPassword();
				String passy = new String(passyArray);
			
				if (passy.equals(password)){
					JOptionPane.showMessageDialog(null, "Computer: Access granted");
					frame.getContentPane().remove(passwordField);
					addButton();
					stage.levelCheck();
					refresh();
				}
				else {
					JOptionPane.showMessageDialog(null, "Computer: Access denied");
				}
			}
		}
	}
	
	class TextFieldListener implements ActionListener{ 
		
		public void actionPerformed(ActionEvent etf) {
			if (stage.getLevelNum() == 17) {
				JTextField input = (JTextField) etf.getSource();
				String text = input.getText();
			
				if (text.equals("25")){
					JOptionPane.showMessageDialog(null, "Computer: Correct");
					stage.levelCheck();
					refresh();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Computer: Incorrect");
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
			removeButton();
			passwordField = new JPasswordField(4);
			frame.getContentPane().add(BorderLayout.SOUTH, passwordField);
			passwordField.addActionListener(new AL());
			refresh();
		}
		if (stage.getLevelNum() == 16) {

//			button = new JButton("Start");
//			button.addActionListener(this);
			System.out.println("Test1");
			stage.levelCheck();
			refresh();

		}
		if (stage.getLevelNum() == 17) {
			System.out.println("Test2");
			
			//removeButton();
			addTextField();
			textField.addActionListener(new TextFieldListener());
			
		}
	}
		
	public void removeButton(){
		//button.setVisible(false);
		frame.getContentPane().remove(button);
	}
	
	public void addTextField(){
		frame.getContentPane().add(BorderLayout.SOUTH, textField);
	}
	
	public void addButton(){
		button = new JButton("Start");
		button.addActionListener(this);
	}
	
	@SuppressWarnings("deprecation")
	public void refresh() {
		String buttonLabel = stage.getButtonLabel();
		button.setLabel(buttonLabel);
		text.append(stage.getLevelText());
	}		

}
