package class28;

public class AssignmentMain {
    public static void main(String[] args) {
        AssignmentInClass a1 = new AssignmentInClass();
        a1.printName("Guldana");
        a1.printLastName("Baktybekova");

        System.out.println();

        AssignmentChild a2 = new AssignmentChild();
        a2.printName("Guldana");
        a2.printLastName("Baktybekova");
        a2.printCitizenship("Kyrgyzstan");
        a2.printCountryOfBirth("Kyrgyzstan");
    }
}
