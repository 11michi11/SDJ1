import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DateGUI extends JFrame {

	public DateGUI() {
		setSize(300,200);
		setLocationRelativeTo(null);
		setTitle("Date GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JPanel datePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel dateLabel = new JLabel("Date:");
		dateLabel.setForeground(Color.RED);
		datePanel.add(dateLabel);
		
		JPanel panel = new JPanel();
		
		JLabel dayL = new JLabel("Day:");
		dayL.setSize(40, 30);
		JTextField dayTF = new JTextField(5);
		JLabel monthL = new JLabel("Month:");
		JTextField monthTF = new JTextField(5);
		JLabel yearL = new JLabel("Year:");
		JTextField yearTF = new JTextField(5);
		
		JButton show = new JButton("Show");
		show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String day = dayTF.getText().equals("") ? "00" : dayTF.getText();
				String month = monthTF.getText().equals("") ? "00" : monthTF.getText();
				String year = yearTF.getText().equals("") ? "00" : yearTF.getText();
				dateLabel.setText("Date: " + day + "/" + month + "/" + year);
			}
		});
		
		
		JPanel dayTextWrapper = new JPanel();
		dayTextWrapper.add(dayTF);
		JPanel monthTextWrapper = new JPanel();
		monthTextWrapper.add(monthTF);
		JPanel yearTextWrapper = new JPanel();
		yearTextWrapper.add(yearTF);
		JPanel showWrapper = new JPanel();
		showWrapper.add(show);
		
		
		GridLayout gridLayout = new GridLayout(3,2);
		panel.setLayout(gridLayout);
		
		panel.add(dayL);
		panel.add(dayTextWrapper);
		
		panel.add(monthL);
		panel.add(monthTextWrapper);
		
		panel.add(yearL);
		panel.add(yearTextWrapper);
		
		JPanel formPanel = new JPanel();
		formPanel.add(panel);
		formPanel.add(showWrapper);
		
		mainPanel.add(datePanel, BorderLayout.NORTH);
		mainPanel.add(formPanel, BorderLayout.EAST);
		
		add(mainPanel);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				DateGUI frame = new DateGUI();
				frame.setVisible(true);
				frame.pack();
			}
		});
		
	}
	
}
