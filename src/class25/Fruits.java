package class25;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Fruits {
    float weight;
    float price;
    float cost;
    String color;

    void getCost(){
        System.out.println(cost=weight*price);
    }

    void getWeight() {
        System.out.println(weight=cost/price);
    }

    void getPrice() {
        System.out.println(price=cost/weight);
    }
//  Homework Nov 16

    Fruits() {
    }
    Fruits(int weight, int price) {
        System.out.println("Cost: " + weight*price);
    }

    Fruits(String color) {
        System.out.println("Color of this fruit is " + color);
    }

    Fruits(String color1, float price1){
        color= color1;
        price=price1;
    }
}
