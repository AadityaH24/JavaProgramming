package Lab5;

public class DemoSugarSmashPlayer {
    public static void main(String[] args) {
        System.out.println("19BAI1098");
        //Make objects

        SugarSmashPlayer p1 = new SugarSmashPlayer();
        SugarSmashPlayer p2 = new SugarSmashPlayer();
        //premium
        PremiumSugarSmashPlayer p3 = new PremiumSugarSmashPlayer();
        PremiumSugarSmashPlayer p4 = new PremiumSugarSmashPlayer();
        PremiumSugarSmashPlayer p5 = new PremiumSugarSmashPlayer();
    
        System.out.println("Initializing Players..");
        p1.setId(1);
        p1.setScreenName("Player 1");
        // p1.printAllScores();

        p2.setId(2);
        p2.setScreenName("Player 2");
        // p2.printAllScores();

        System.out.println("");
        System.out.println("Set score for level 4. Player 1 has 100+ points in these levels, Player 2 doesnt.");
        System.out.println("Player ID: "+ p1.getId() + " ScreenName: " + p1.getScreenName());
        p1.setHighscore(1, 120);
        p1.setHighscore(2, 120);
        p1.setHighscore(3, 150);
        p1.printAllScores();
        System.out.println("Add Score");
        p1.setHighscore(4, 140);
        p1.printAllScores();
        System.out.println("");
        System.out.println("Player ID: "+ p2.getId() + " ScreenName: " + p2.getScreenName());
        p2.printAllScores();
        System.out.println("Add Score");
        p2.setHighscore(4, 140);
        p2.printAllScores();

        System.out.println("Player 1 tries to set score for level 25");
        p1.setHighscore(25, 165);

        System.out.println("");
        System.out.println("");
        System.out.println("Initialize Player 3 and 4 and 5. P3 pays 1$ and p4 and p5 pays 2.99.");
        
        System.out.println("Player 3");
        p3.setId(3);
        p3.setScreenName("Premium 3");
        p3.setPaid(1);
        System.out.println("");
        System.out.println("Player 4");
        p4.setId(4);
        p4.setScreenName("Premium 4");
        p4.setPaid(2.99f);
        System.out.println("");
        System.out.println("Player 5");
        p5.setId(5);
        p5.setScreenName("Premium 5");
        p5.setPaid(2.99f);
        


        System.out.println("");
        System.out.println("");
        System.out.println("Set score for level 4. Player 3 isnt premium and doesnt have enough points in these levels,Player 4 is premium but doesnt have points. Player 5 does both.");
       
        System.out.println("");
        System.out.println("Player ID: "+ p3.getId() + " ScreenName: " + p3.getScreenName());
        p3.setHighscore(4, 120);
        p3.printAllScores();
        System.out.println("");
        System.out.println("Player ID: "+ p4.getId() + " ScreenName: " + p4.getScreenName());
        p4.setHighscore(4, 123);
        p4.printAllScores();
        System.out.println("");
        System.out.println("Player ID: "+ p5.getId() + " ScreenName: " + p5.getScreenName());
        p5.setHighscore(1, 120);
        p5.setHighscore(2, 180);
        p5.setHighscore(3, 150);
        p5.setHighscore(4, 125);
        p5.printAllScores();
    }
    
}
