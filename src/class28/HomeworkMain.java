package class28;

public class HomeworkMain {
    public static void main(String[] args) {
        Flowers fl = new Flowers();
        fl.bloom();

        System.out.println("-------------------");

        Rosaceae rs = new Rosaceae();
        System.out.println(rs.name);

        System.out.println("-------------------");

        Roses r = new Roses("red");
        System.out.println("Roses are " + r.color);
        r.bloomRose();
    }
}
