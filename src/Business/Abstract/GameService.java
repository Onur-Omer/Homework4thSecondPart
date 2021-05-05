package Business.Abstract;

import Entity.Concrate.Game;

import java.util.List;

public interface GameService {
    void AddGame(Game game);
    void DeleteGame(Game game);
    List<Game> GetAll();

}
