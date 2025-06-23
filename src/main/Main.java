package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("2D Adventure");
		
		GamePainel gamePainel = new GamePainel();
		window.add(gamePainel);
		
		window.pack();// empacotar este JPanel para que possamos vê-lo
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}
}
