import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class GameGUI implements ActionListener{

	JTextArea text;
	JButton button;
	Level stage = new Level(1, "", "");
		
	public void initialize(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
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
	
	public void actionPerformed(ActionEvent ev) {
		stage.levelCheck();
		refresh();
	}
	
	@SuppressWarnings("deprecation")
	public void refresh() {
		String buttonLabel = stage.getButtonLabel();
		button.setLabel(buttonLabel);
		text.append(stage.getLevelText());
	}
	
}
