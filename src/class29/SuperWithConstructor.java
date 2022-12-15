package class29;

import java.sql.SQLOutput;

class Bank1 {
//    Bank1() {
//        this(10);
//        System.out.println("From Bank");
//    }
    // Constructor of parent class
    Bank1(int balance) {
        System.out.println("From Bank " + balance);
    }
}

class CitiBank extends Bank1{
    // Constructor of child
    CitiBank(int a) {
        super(a);
    }
}
public class SuperWithConstructor {
    public static void main(String[] args) {
        CitiBank b = new CitiBank(20);
    }
}
