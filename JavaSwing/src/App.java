import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {/// this is for the thread. it has only one method which is public
													/// void run. this ensures that the application doesnt crash
			public void run() {
				new MainFrame(); // this is similar to JFrame frame = new JFrame(); it is calling the MainFrame
									// object
			}
		});

	}
}
