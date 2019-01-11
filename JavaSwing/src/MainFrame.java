import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
//import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame() {
		super("Hello World");//this is calling the super class constructor
		
		setLayout(new BorderLayout()); //this is setting the layout of the components so that buttons etc can be added.
		
		textArea = new JTextArea();
		btn = new JButton("click Me");
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 600);// this sets the size of the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// this line makes sure that when click on X the application
														// actually quits completely
		setVisible(true); // This makes the frame to be visible
	}
}
