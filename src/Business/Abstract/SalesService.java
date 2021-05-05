package Business.Abstract;

import Entity.Concrate.Game;
import Entity.Concrate.Gamer;

public interface SalesService {
    void BuyGame(Gamer gamer, Game game);
}
