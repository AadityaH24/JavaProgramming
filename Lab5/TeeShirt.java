package Lab5;

public class TeeShirt {
    int orderNum;
    String size;
    String color;
    float price;

    public void setColor(String color) {
        this.color = color;
    }
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    public void setSize(String size) {
        this.size = size;
        if(size.equals("XXL") || size.equals("XXXL")){
           this.price = 22.99f;

        }
        else{
            this.price = 19.99f;
        }
    }
    int getOrderNum(){
        return orderNum;
    }
    String getSize(){
        return size;

    }
    String getColor(){
        return color;
    }
    float getPrice(){
        return price;
    }


}
