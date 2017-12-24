import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;

public class TestForm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestForm window = new TestForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 301, 154);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setResizable(false);
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setVgap(10);
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 0;
		panel_1.add(panel_5, gbc_panel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Exit on OK");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 1;
		panel_1.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JLabel lblX = new JLabel("X");
		GridBagConstraints gbc_lblX = new GridBagConstraints();
		gbc_lblX.anchor = GridBagConstraints.EAST;
		gbc_lblX.insets = new Insets(0, 0, 5, 5);
		gbc_lblX.gridx = 1;
		gbc_lblX.gridy = 1;
		panel_1.add(lblX, gbc_lblX);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(5);
		
		JCheckBox chckbxExitOnCancle = new JCheckBox("Exit on Cancle");
		GridBagConstraints gbc_chckbxExitOnCancle = new GridBagConstraints();
		gbc_chckbxExitOnCancle.anchor = GridBagConstraints.WEST;
		gbc_chckbxExitOnCancle.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxExitOnCancle.gridx = 0;
		gbc_chckbxExitOnCancle.gridy = 2;
		panel_1.add(chckbxExitOnCancle, gbc_chckbxExitOnCancle);
		
		JLabel lblY = new JLabel("Y");
		GridBagConstraints gbc_lblY = new GridBagConstraints();
		gbc_lblY.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblY.insets = new Insets(0, 0, 0, 5);
		gbc_lblY.gridx = 1;
		gbc_lblY.gridy = 2;
		panel_1.add(lblY, gbc_lblY);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(5);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		panel.add(panel_2);
		
		JButton btnOk = new JButton("OK");
		panel_2.add(btnOk);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JButton btnCancle = new JButton("Cancle");
		panel_3.add(btnCancle);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JButton btnClear = new JButton("Clear");
		panel_4.add(btnClear);
		

		btnOk.setPreferredSize(btnCancle.getPreferredSize());
		btnClear.setPreferredSize(btnCancle.getPreferredSize());
	}

}
