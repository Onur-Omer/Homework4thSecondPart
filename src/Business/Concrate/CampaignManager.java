package Business.Concrate;

import Business.Abstract.CampaignService;
import Entity.Concrate.Campaign;
import Entity.Concrate.Game;

import java.util.List;


public class CampaignManager implements CampaignService {
    List<Campaign> campaignList;

    @Override
    public void AddCampaign(Campaign campaign) {
        campaignList.add(campaign);
        System.out.println("Success");
    }

    @Override
    public void UpdateCampaign(Campaign campaign,String name,int discount) {
        int index=campaignList.indexOf(campaign);
        campaignList.get(index).setDiscount(discount);
        campaignList.get(index).setName(name);
    }

    @Override
    public void DeleteCampaign(Campaign campaign) {
        campaignList.remove(campaign);
        System.out.println("Success");
    }

    @Override
    public List<Game> ApllyDiscount(List<Game> games,Campaign campaign) {
        for (Game game : games) {
            game.setPrice(game.getPrice()-game.getPrice() * campaign.getDiscount());
        }
        return games;
    }

    @Override
    public List<Campaign> GetAll() {
        return campaignList;
    }
}
