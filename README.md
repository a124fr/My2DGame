# 🎮 Projeto: Construindo Jogo 2D em Java

Este projeto é uma implementação prática da série **"How to Make a 2D Game in Java"** criada por [RyiSnow no YouTube](https://www.youtube.com/@RyiSnow), com o objetivo de ensinar os conceitos fundamentais por trás da criação de jogos 2D utilizando Java puro (sem bibliotecas externas de jogos).

![Screenshot do jogo](docs/jogo2D.jpeg)

## 📌 Episódio Base

- 🎥 [How to Make a 2D Game in Java #1 - The Mechanism of 2D Games](https://www.youtube.com/watch?v=om59cwR7psI&list=PL_QPQmz5C6WUF-pOQDsbsKbaBZqXj4qSq&index=1)

## 🚀 Funcionalidades Implementadas

- Loop de jogo com lógica de FPS fixa
- Sistema de atualização e renderização de sprites
- Gerenciamento de entradas pelo teclado (KeyHandler)

## 🛠️ Tecnologias Utilizadas

- Java (JDK 17 ou superior recomendado)
- IDE recomendada: IntelliJ IDEA ou Eclipse
- Swing para renderização gráfica
- `BufferedImage` para manipulação de sprites

## 📂 Estrutura Básica do Projeto

```
My2DGame/
├── src/
│   └── main/
│       ├── GamePainel.java
│       ├── KeyHandler.java
│       └── Main.java
├── docs/
│   └── jogo2D.jpeg
├── .classpath
├── .gitignore
├── .project
└── README.md
```

## ▶️ Como Rodar o Projeto

1. Clone este repositório:
   ```bash
   git clone git@github.com:a124fr/My2DGame.git
   cd jogo-2d-java

2. Compile os arquivos Java:
javac src/* .java

3. Execute o jogo:
java -cp src Main

💡 Certifique-se de que suas imagens estejam na pasta res/ e referenciadas corretamente no código.

🎯 Próximos Passos
- Movimento básico do personagem principal com animação
- Implementar colisão com o mapa
- Adicionar tiles e mapa do mundo
- Criar sistema de NPCs e diálogos
- Inventário e combate

📸 Capturas de Tela
Você pode visualizar uma demonstração do jogo abaixo:
![Screenshot do jogo](docs/jogo2D.jpeg)


📽️ Demonstração em Vídeo
Vídeo da execução atual do projeto:

(Você pode adicionar o vídeo [2025-06-22 19-11-35.mp4] no GitHub ou converter para GIF e adicionar aqui)

🧑‍💻 Autor
Desenvolvido por Francisco de Assis


