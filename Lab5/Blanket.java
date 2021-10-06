package Lab5;

public class Blanket {
    String size,color,material;
    float price;

    Blanket(){
        size = "twin";
        color = "white";
        material = "cotton";
        price = 30.00f;
    }
    public void setSize(String size) {
        this.size = size;
        switch (size) {
            case "double":
                this.price += 10;
                break;
            case "queen":
                this.price += 25;
                break;
            case "king":
                this.price += 40;
                break;
        
            default:
                System.out.println("Invalid Size. Resetting.");
                this.size = "twin";
                this.color = "white";
                this.material = "cotton";
                this.price = 30.00f;
                break;
        }
    }
    public void setColor(String color) {
        this.color = color;

    }
    public void setMaterial(String material) {
        this.material = material;
        switch (material) {
            case "wool":
                this.price += 20;
                break;
            case "cashmere":
                this.price += 45;
                break;
        
            default:
                System.out.println("Invalid Material. Resetting");
                this.size = "twin";
                this.color = "white";
                this.material = "cotton";
                this.price = 30.00f;
                break;
        }
    }

    public String toString() {
        String desc = "|" + price + "$  \t|" +color + "\t|"+ size + "-sized\t|" + material + "-type|";
        return desc;
    }

}
