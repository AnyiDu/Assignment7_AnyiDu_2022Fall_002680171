import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Main");// Set the width and height of the frame
		frame.setSize(1200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();//create panel
		frame.add(panel);//add panel

		MyFrame2.placeComponents(panel);
		frame.setVisible(true);
	}
}