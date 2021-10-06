package Lab5;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    boolean paid = false;

    public void setPaid(float payment) {
        if(payment > 2.99){
            this.paid = true;
            this.highscore = new int[50];
            System.out.println("Payment Successfull");
        }
        else{
            System.out.println("Insufficient Amount. Payment Deneid");
        }

    }
    
    public void setHighscore(int level, int score){
        if(paid){
            this.highscore[level-1] = score;
        }
        else{
            super.setHighscore(level, score);

        }
    }
}
