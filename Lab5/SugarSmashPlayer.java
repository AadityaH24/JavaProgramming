package Lab5;

import java.util.Arrays;

public class SugarSmashPlayer {
    int id;
    String screenName;
    int[] highscore = new int[10];

    public void setId(int id) {
        this.id = id;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    public void setHighscore(int level, int score) {
        boolean levelReq = true;
        if(level > 10 || level < 0){
            System.out.println("Error: Cannot set Score. Invalid Level.");
            return;
        }
        for (int i = 0; i < level -1; i++) {
            if(highscore[i] < 100){
                levelReq = false;
            }
            
        }
        
        if (levelReq) {
            this.highscore[level -1] = score;
        }
        else{
            System.out.println("Error: Cannot set Score. Invalid Score prerequisite not complete.");
        }
    }
    
    public int getId() {
        return this.id;
    }
    public String getScreenName() {
        return this.screenName;
    }
    public int getHighscore(int level, int score) {
        return this.highscore[level - 1];
    }
    public void printAllScores(){
        System.out.println(Arrays.toString(this.highscore));
    }
}
