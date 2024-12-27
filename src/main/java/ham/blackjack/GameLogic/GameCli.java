package ham.blackjack.GameLogic;

import java.io.IOException;

public class GameCli {
    GameTurn turn;

    public GameCli() throws IOException{
      turn = new GameTurn();
    }

    public void gameLoop() {
      turn.initialStart();
      System.out.println(turn);
    }

    public static void main(String[] args) throws IOException {
      GameCli game = new GameCli();
      game.gameLoop();
    }

}