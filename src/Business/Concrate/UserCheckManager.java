package Business.Concrate;

import Business.Abstract.UserCheckService;
import Entity.Abstract.Entity;
import Entity.Concrate.Gamer;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean CheckUserForReal(Entity entity) {
        return true;
    }
}
