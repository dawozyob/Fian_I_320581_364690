package gui01_text_aendern.ml.szyska;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private GameView gameView;

	public GameView getGameView() {
		return gameView;
	}

	public void setGameView(GameView gameView) {
		this.gameView = gameView;
	}
	
	public MainFrame() {
		this.setTitle("Beispiel");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(300, 200, 800, 600);
		
		this.setGameView(new GameView());
		this.setContentPane(this.getGameView());
		
		
		this.setVisible(true);
	}
}
