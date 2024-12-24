package ham.blackjack.GameLogic;

import java.io.IOException;

public class GameCli {
    GameTurn turn;

    public GameCli() throws IOException{
      turn = new GameTurn();
    }

    public void gameLoop() {
      
    }

    public static void main(String[] args) throws IOException {
      GameCli game = new GameCli();
      game.gameLoop();
    }

}