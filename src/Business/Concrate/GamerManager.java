package Business.Concrate;

import Business.Abstract.GamerService;
import Business.Abstract.UserCheckService;
import Entity.Concrate.Gamer;

public class GamerManager implements GamerService {
    UserCheckService userCheckService;

    public GamerManager(UserCheckManager userCheckManager) {
    }

    @Override
    public void AddGamer(Gamer gamer) {
        if(userCheckService.CheckUserForReal(gamer))
            System.out.println("Success Welcome "+gamer.getFirstName());
    }

    @Override
    public void UpdateGamer(Gamer gamer,String LastName,String FirstName) {
        gamer.setFirstName(FirstName);
        gamer.setLastName(LastName);
    }

    @Override
    public void DeleteGamer(Gamer gamer) {
        System.out.println("Success Goodbye "+gamer.getFirstName());
    }
}
