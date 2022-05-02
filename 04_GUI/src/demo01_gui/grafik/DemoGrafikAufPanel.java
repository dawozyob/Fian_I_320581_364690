package demo01_gui.grafik;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoGrafikAufPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo01ActionListener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 200, 800, 600);
		JPanel panel = new MeinPanel();
		frame.setContentPane(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		
		frame.setVisible(true);
	}
}


class MeinPanel extends JPanel{
	
	BufferedImage img;
	
	public MeinPanel() {
		try {
			this.img = ImageIO.read(this.getClass().getResource("/rkt.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g.setColor(Color.black);
		g.setFont(new Font("Arial", Font.PLAIN, 40));
		g.drawString("Ein String", 10, 30);
		
		g.setColor(Color.RED);
		g.drawString("Zweiter String", 10, 80);
		
		
		g.setColor(Color.black);
		g.drawLine(10, 100, 30, 100);
		
		g2d.setStroke(new BasicStroke(10));
		g2d.draw(new Line2D.Double(40, 100, 60, 100));
		
		g.drawImage(img, 100, 100, 80, 100, null);
		
	}
	
	private void paintRocket() {
		Graphics g = this.getGraphics();
		g.drawImage(img, 300, 100, 80, 100, null);
		this.repaint();
	}
}
