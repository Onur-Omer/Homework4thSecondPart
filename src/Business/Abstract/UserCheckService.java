package Business.Abstract;

import Entity.Abstract.Entity;
import Entity.Concrate.Gamer;

public interface UserCheckService {
    boolean CheckUserForReal(Entity entity);
}
