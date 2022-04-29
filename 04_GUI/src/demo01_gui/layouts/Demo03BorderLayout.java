package demo01_gui.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Demo03BorderLayout {
	public static void main(String[] args) {
			
//		demo01();
		demo02();
	}

	private static void demo02() {
		JFrame frame = new JFrame();
		frame.setTitle("Demo02FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(new BorderLayout());
		
		JButton west = new JButton("West");
		JButton east = new JButton("East");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		JPanel north = new JPanel();
		north.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
		north.add(new JButton("NP Button 1"));
		north.add(new JButton("NP Button 2"));
		north.add(new JButton("NP Button 3"));
		
		System.out.println(((JButton)north.getComponents()[0]).getText());
		
		panel.add(north, BorderLayout.NORTH);
		panel.add(west, BorderLayout.WEST);
		panel.add(east, BorderLayout.EAST);
		panel.add(south, BorderLayout.SOUTH);
		panel.add(center, BorderLayout.CENTER);
		
		System.out.println(north.getParent().getClass().getSimpleName());
		frame.setVisible(true);
		
	}

	private static void demo01() {
		JFrame frame = new JFrame();
		frame.setTitle("Demo02FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(new BorderLayout());
		
		JButton north = new JButton("North");
		JButton west = new JButton("West");
		JButton east = new JButton("East");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
				
		panel.add(north, BorderLayout.NORTH);
		panel.add(west, BorderLayout.WEST);
		panel.add(east, BorderLayout.EAST);
		panel.add(south, BorderLayout.SOUTH);
		panel.add(center, BorderLayout.CENTER);
		
		frame.setVisible(true);
		
	}
	
	
}
