package Business.Concrate;

import Business.Abstract.GameService;
import Entity.Concrate.Game;

import java.util.List;

public class GameManager implements GameService {
    private List<Game> games;

    @Override
    public void AddGame(Game game) {

        games.add(game);
        System.out.println("Success");
    }

    @Override
    public void DeleteGame(Game game) {
        games.remove(game);
        System.out.println("Success");
    }

    @Override
    public List<Game> GetAll() {
        return games;
    }
}
