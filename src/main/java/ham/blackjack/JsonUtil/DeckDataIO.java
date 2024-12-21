package ham.blackjack.JsonUtil;

import java.io.IOException;
import java.util.List;

import ham.blackjack.GameLogic.Card;


public class DeckDataIO {    

    public static List<Card> buildDeckFromJsonFile(String filename)throws IOException{
        return JsonUtil.listFromJsonFile(filename, Card.class);
    }
}
    
