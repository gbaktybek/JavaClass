package class29;

class Hw1 {
    Hw1() {
        System.out.println("Hello from Hw1");
    }
    Hw1(int hw){
        System.out.println("I just put any number: " + hw);
    }
}

class Hw2 extends Hw1{
    Hw2(){
        super(6);
        System.out.println("hello from Hw2");
    }
    Hw2(String hw){
        this();
        System.out.println("typing the first thing that came to my mind: "+hw);
    }
}

class Hw3 extends Hw2{
    String str;
    Hw3(){
        super("a dog");
        System.out.println("Hello from Hw3");
    }
    Hw3(String hi){
        this.str=hi;
        System.out.println(hi);
    }
}