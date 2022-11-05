import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MyFrame2 extends JFrame {
	public static void placeComponents(JPanel panel) {

		panel.setLayout(null);
		// create JLabel，JTextField, JButton, JTextArea
		JLabel label1 = new JLabel("Reading file name: ");
		label1.setBounds(20, 30, 150, 30);
		panel.add(label1);
		JTextField textField1 = new JTextField();
		textField1.setBounds(150,30,400,30);
		panel.add(textField1);
		//JTextField textField1 = new JTextField("/Users/duanyi/Desktop/annual.csv
		JButton B1 = new JButton("Click to read from file");
		B1.setBounds(20, 65, 150, 30);
		panel.add(B1);
		JLabel label2 = new JLabel("First five lines of file:");
		JTextArea textArea1 = new JTextArea();;
		label2.setBounds(20, 110, 150, 30);
		panel.add(label2);
		textArea1.setBounds(20, 130, 500, 100);
		panel.add(textArea1);

		B1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String fileName = textField1.getText();
				file fIO = new file();
				String strOut;
				try {
					strOut = fIO.readFile(fileName);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
				textArea1.setText(strOut);

			}
		});



		// create JLabel，JTextField, JButton, JTextArea
		JLabel label3 = new JLabel("File name to write: ");
		//JTextField textField1 = new JTextField("/Users/duanyi/Desktop/annual.csv");
		JTextField textField2 = new JTextField("user input");
		label3.setBounds(600, 20, 170, 25);
		panel.add(label3);
		textField2.setBounds(7800,20,400,25);
		panel.add(textField2);
		JLabel label4 = new JLabel("First five lines of file:");
		JTextArea textArea2 = new JTextArea();
		JButton B2 = new JButton("Click to write to file");
		B2.setBounds(600, 65, 170, 25);
		panel.add(B2);
		label4.setBounds(600, 110, 170, 25);
		panel.add(label4);
		textArea2.setBounds(600, 130, 500, 100);
		panel.add(textArea2);
		B2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String fileName = textField2.getText();
				file fIO = new file();
				File f = new File("/Users/duanyi/Desktop/annual.csv");
				String strOut;
				try {
					fIO.writeFile(fileName,f);
					strOut = fIO.readFile(fileName);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
				textArea2.setText(strOut);

			}
		});

		/* set position
		 * set Bounds
		 */

		B2.setBounds(600, 65, 170, 25);
		panel.add(B2);
		label4.setBounds(600, 110, 170, 25);
		panel.add(label4);
		textArea2.setBounds(600, 130, 500, 100);
		panel.add(textArea2);
	}
}