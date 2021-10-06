package Lab5;

public class ElectricBlanket extends Blanket {
    int heatSettings;
    String autoShut;
    ElectricBlanket(){
        super();
        heatSettings = 1;
        autoShut = "NO";

    }
    public void setHeatSettings(int heatSettings) {
        if (heatSettings >=1 && heatSettings <= 5) {
            this.heatSettings = heatSettings;
        }
        else{
            
            System.out.println("Invalid HeatSetting "+ heatSettings + " Set to 1.");
            System.out.println(this.toString()+"\n\n");
            this.heatSettings = 1;
        }
    }

    public void setAutoShut(String autoShut) {
        if (autoShut.equals("YES")) {
            this.autoShut = autoShut;
            this.price += 5.75f;
        }
    }

    public String getAutoShut() {
        return autoShut;
    }
    public int getHeatSettings() {
        return heatSettings;
    }
    public String toString() {
        String desc = super.toString();
        desc += "\t|Number of Heat Settings: "+ heatSettings+ "\t|Automatic Shutoff: " + autoShut;
        return desc;
    }
}
