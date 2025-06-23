package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePainel extends JPanel implements Runnable {

	// SCREEN SETTINGS
	final int originalTileSize = 16; // 16x16 tile será tamanho padrão do personagem do jogador, NPCS e Peçcas do mapa neste Jogo
	final int scale = 3;// dimensinamento para desenvolver jogos 2D de estilo retrô.
	
	final int tileSize = originalTileSize * scale; // 48x - Basicamente este é um bloco de 48x48, então este é o tamanho real do bloco que será exibido em nossa tela de jogo
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	
	final int screenWidth = tileSize * maxScreenCol; //768 pixels
	final int screenHeight = tileSize * maxScreenRow; // 576 pixels
	
	Thread gameThread;
	
	public GamePainel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		// JPanel tem um espécie de função de buffer duplo como padrão
		// então e uacho que é uma boa ideia fazer isso 
		// verdadeiro para melhor desempenho de renderização
		this.setDoubleBuffered(true);
				
		
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	// Basicamente, quando iniciamos o gameThread, ele chama automaticamente esse método de execução.
	// Este método de execução, criamos um loop de jogo que será o núcleo do jogo
	@Override
	public void run() {// Game Loop
		
		while (gameThread != null) {
			
			System.out.println("The game loop is running...");
			
			// 1 UPDATE: update information such as character position
			update();
			// 2 DRAW: draw the screen width the updated information
			repaint();
		}		
		
	}
	
	public void update() {
		
	}
	
	// Método embutido em Java, é um método padrão para desenhar coisas no JPanel
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.white);
		g2.fillRect(100, 100, tileSize, tileSize);
		g2.dispose();
		
	}
	
}
