package demo01_gui.listener;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo02MouseListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo01ActionListener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 200, 800, 600);
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		frame.setVisible(true);
	}
}

class MyMouseListener implements MouseListener, MouseWheelListener, MouseMotionListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {

	}

}

class MyMouseAdapter extends MouseAdapter {
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println();
	}
}

class MyKeyboardListener implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

class MyKeyBoardAdapter extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
}
