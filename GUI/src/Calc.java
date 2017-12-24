import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calc extends JFrame{

	public Calc() {
		setSize(300, 300);
		setTitle("Calc");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JPanel textPanel = new JPanel();
		JTextField text = new JTextField(15);
//		textPanel.add(text);

		JPanel panel = new JPanel(new GridLayout(4,4));
		
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");

		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton div = new JButton("/");
		JButton mult = new JButton("*");
		JButton point = new JButton(".");
		JButton equal = new JButton("=");
		
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(div);
		
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(mult);
		
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(minus);
		
		panel.add(zero);
		panel.add(point);
		panel.add(equal);
		panel.add(plus);
		
		
		mainPanel.add(text, BorderLayout.NORTH);
		mainPanel.add(panel);
		
		add(mainPanel);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Calc frame = new Calc();
//				frame.pack();
				frame.setVisible(true);
			}
		});
	}
	
}
