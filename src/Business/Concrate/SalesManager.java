package Business.Concrate;

import Business.Abstract.SalesService;
import Entity.Concrate.Game;
import Entity.Concrate.Gamer;

public class SalesManager implements SalesService {
    @Override
    public void BuyGame(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + game.getName() + "Adlı oyunu aldınız");
    }
}
