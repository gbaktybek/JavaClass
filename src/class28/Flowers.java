package class28;


class Flowers {
    int quantity = 416;

    Flowers() {
        System.out.println("There are " + this.quantity + " different families of flowers");
    }
    void bloom() {
        System.out.println("Bloom");
    }
}

class Rosaceae extends Flowers {
    String name;
    Rosaceae() {
        this.name="Rosaceae";
    }

}

class Roses extends Rosaceae{
    String color;
    Roses(String color){
        this.color=color;
    }
    void bloomRose(){
        System.out.println("Roses bloom between late spring and early fall");
    }
}
