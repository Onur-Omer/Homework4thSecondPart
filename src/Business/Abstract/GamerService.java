package Business.Abstract;

import Entity.Concrate.Gamer;

public interface GamerService {
    void AddGamer(Gamer gamer);
    void UpdateGamer(Gamer gamer,String LastName,String FirstName);
    void DeleteGamer(Gamer gamer);
}
