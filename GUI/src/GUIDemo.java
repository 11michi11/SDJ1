import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIDemo extends JFrame {
	
	BufferedImage image;

	public GUIDemo() throws IOException {
		setSize(800, 500);
		setLocationRelativeTo(null);

		ImgPanel panel = new ImgPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		JLabel lab = new JLabel("English motherfucker!");
		lab.setFont(new Font("Verdana", Font.BOLD, 20));
		panel.add(lab);
		
		JButton button = new JButton("Click me");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lab.setText("SURPRISE MOTHERFUCKER!");
				lab.setFont(new Font("Verdana", Font.BOLD, 30));
				try {
					panel.image = ImageIO.read(new File("surprise.jpg"));
					panel.repaint();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(button);
		
		add(panel);
	}

	public static void main(String[] args) throws IOException {
		GUIDemo frame = new GUIDemo();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Pulp Fiction");
				frame.setVisible(true);
				
			}
		});
	}
	
	 
	
}


class ImgPanel extends JPanel{
	
	public BufferedImage image;
	
	public ImgPanel() throws IOException {
		super();
		image = ImageIO.read(new File("english.jpg"));
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 175, 100, this); // see javadoc for more info on the parameters            
    }
}
