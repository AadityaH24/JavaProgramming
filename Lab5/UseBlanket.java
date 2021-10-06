package Lab5;

public class UseBlanket {
    
    public static void printData(Blanket[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
        
    }
    public static void main(String[] args) {
        System.out.println("19BAI1098");

        //twin double queen king, cotton wool cashmere, white blue
        Blanket[] blankets = new Blanket[24];
        for (int i = 0; i < blankets.length; i++) {
            blankets[i] = new Blanket();
            
        }
        for (int i = 0; i < blankets.length; i++) {
            switch (i%4) {
                case 1:
                    blankets[i].setSize("double");
                    break;
                case 2:
                    blankets[i].setSize("queen");
                    break;
                case 3:
                    blankets[i].setSize("king");
                    break;
            
                default:
                    break;
            }
            switch (i%3) {
                case 1:
                    blankets[i].setMaterial("wool");
                    break;
                case 2:
                    blankets[i].setMaterial("cashmere");
                    break;
            
                default:
                    break;
            }
            switch (i/12) {
                case 1:
                    blankets[i].setColor("Blue");
                    break;
                default:
                    break;
            }
            
        }

        //same as blanket but with yes and no, heat values are randomized
        ElectricBlanket[] elecBlankets = new ElectricBlanket[48];
        for (int i = 0; i < elecBlankets.length; i++) {
            elecBlankets[i] = new ElectricBlanket();
            
        }

        for (int i = 0; i < elecBlankets.length; i++) {
            switch (i%4) {
                case 1:
                    elecBlankets[i].setSize("double");
                    break;
                case 2:
                    elecBlankets[i].setSize("queen");
                    break;
                case 3:
                    elecBlankets[i].setSize("king");
                    break;
            
                default:
                    break;
            }
            switch (i%3) {
                case 1:
                    elecBlankets[i].setMaterial("wool");
                    break;
                case 2:
                    elecBlankets[i].setMaterial("cashmere");
                    break;
            
                default:
                    break;
            }
            switch (i/12) {
                case 1:
                    elecBlankets[i].setColor("Blue");
                    break;
                case 3:
                    elecBlankets[i].setColor("Blue");
                    break;
                default:
                    break;
            }
            elecBlankets[i].setHeatSettings(0 + (int)(Math.random() * (6 + 1)));//get random setting value from 0 to 6
            switch (i/24) {
                case 1:
                    elecBlankets[i].setAutoShut("YES");
                    break;
                default:
                    break;
            }
            
        }
        printData(blankets);
        printData(elecBlankets);
    }

    
}
