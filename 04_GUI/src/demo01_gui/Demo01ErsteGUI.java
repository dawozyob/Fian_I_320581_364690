package demo01_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Demo01ErsteGUI {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("Demo01ErsteGUI");
		mainFrame.setBounds(300, 200, 640, 480);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout(5, 5));
		mainPanel.setBackground(Color.blue);
		mainFrame.setContentPane(mainPanel);
		
		JPanel north = new JPanel();
		north.setLayout(new FlowLayout(FlowLayout.CENTER, 5,5));
		north.add(new JLabel("Label 1"));
		north.add(new JLabel("Hier koennte Ihre Werbung stehen"));
		north.add(new JLabel("Label 2"));
		mainPanel.add(north, BorderLayout.NORTH);
		
		JPanel west = new JPanel(new GridLayout(8,1));
		for (int i = 0; i < 8; i++) {
			west.add(new JButton("Button " + i));
		}
		mainPanel.add(west, BorderLayout.WEST);
		
		JPanel center = new JPanel(new GridBagLayout());
		center.setBackground(Color.GREEN);
		
		JTextArea textArea = new JTextArea("Hier koennte Ihre Werbung stehen");
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		center.add(textArea, gbc_textArea);
		
		JButton btn = new JButton("new Button 1");
		GridBagConstraints gbc_newButton = new GridBagConstraints();
		gbc_newButton.insets = new Insets(0, 0, 5, 5);
		gbc_newButton.gridx = 1;
		gbc_newButton.gridy = 0;
		center.add(btn, gbc_newButton);
		
		JButton btn2 = new JButton("new Button 2");
		GridBagConstraints gbc_newButton2 = new GridBagConstraints();
		gbc_newButton2.insets = new Insets(0, 0, 5, 5);
		gbc_newButton2.gridx = 0;
		gbc_newButton2.gridy = 1;
		center.add(btn2, gbc_newButton2);
		
		mainPanel.add(center, BorderLayout.CENTER);
		
		mainFrame.setVisible(true);
		
	}
}
