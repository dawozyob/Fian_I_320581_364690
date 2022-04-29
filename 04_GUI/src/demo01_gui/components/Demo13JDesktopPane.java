package demo01_gui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo13JDesktopPane {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		frame.setTitle("Demo13JDesktopPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		frame.setContentPane(panel);
		Font f = new Font("Arial", Font.PLAIN, 20);
		
		JDesktopPane dp = new JDesktopPane();
		dp.setBounds(0, 0, 800, 600);
		dp.setLayout(null);
		dp.setBackground(Color.LIGHT_GRAY);
		
		JLabel l1 = new JLabel();
		l1.setOpaque(true);
		l1.setBounds(50, 50, 150, 150);
		l1.setBackground(Color.red);
		
		
		JLabel l2 = new JLabel();
		l2.setOpaque(true);
		l2.setBounds(100, 100, 150, 150);
		l2.setBackground(Color.green);
		
		dp.add(l1);
		dp.add(l2);
		
		dp.setLayer(l1, 0);
		dp.setLayer(l2, 1);
		
		JButton btn = new JButton("Rotieren");
		btn.setBounds(400, 50, 100, 50);
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JDesktopPane.getLayer(l1) == 0) {
					dp.setLayer(l1, 1);
					dp.setLayer(l2, 0);
				}else {
					dp.setLayer(l1, 0);
					dp.setLayer(l2, 1);
				}				
			}
		});
		
		dp.add(btn);
		panel.add(dp);
		frame.setVisible(true);
	}
}
