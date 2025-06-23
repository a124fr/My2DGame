package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePainel extends JPanel {

	// SCREEN SETTINGS
	final int originalTileSize = 16; // 16x16 tile será tamanho padrão do personagem do jogador, NPCS e Peçcas do mapa neste Jogo
	final int scale = 3;// dimensinamento para desenvolver jogos 2D de estilo retrô.
	
	final int tileSize = originalTileSize * scale; // 48x - Basicamente este é um bloco de 48x48, então este é o tamanho real do bloco que será exibido em nossa tela de jogo
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	
	final int screenWidth = tileSize * maxScreenCol; //768 pixels
	final int screenHeight = tileSize * maxScreenRow; // 576 pixels
	
	public GamePainel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		// JPanel tem um espécie de função de buffer duplo como padrão
		// então e uacho que é uma boa ideia fazer isso 
		// verdadeiro para melhor desempenho de renderização
		this.setDoubleBuffered(true);
				
		
	}
	
}
