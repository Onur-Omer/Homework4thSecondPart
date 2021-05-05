package Console;

import Business.Concrate.*;
import Entity.Concrate.Campaign;
import Entity.Concrate.Game;
import Entity.Concrate.Gamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        CampaignManager campaignManager= new CampaignManager();
        GameManager gameManager= new GameManager();
        GamerManager gamerManager=new GamerManager(new UserCheckManager());
        SalesManager salesManager=new SalesManager();


        Campaign campaign=new Campaign("Final",0,10);
        Game game= new Game(1,"Mistic Falls",100);
        Gamer gamer=new Gamer("0101","Claus","Michaelson",1000);

        gamerManager.AddGamer(gamer);
        gamerManager.UpdateGamer(gamer,"Michaelson","Elijah");

        gameManager.AddGame(game);
        campaignManager.AddCampaign(campaign);


        campaignManager.ApllyDiscount(gameManager.GetAll(),campaign);

        salesManager.BuyGame(gamer,game);



    }
}
