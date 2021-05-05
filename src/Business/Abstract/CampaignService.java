package Business.Abstract;

import Entity.Concrate.Campaign;
import Entity.Concrate.Game;

import java.util.List;

public interface CampaignService {
    void AddCampaign(Campaign campaign);
    void UpdateCampaign(Campaign campaign,String name,int discount);
    void DeleteCampaign(Campaign campaign);
    List<Game> ApllyDiscount(List<Game> games, Campaign campaign);
    List<Campaign> GetAll();
}
