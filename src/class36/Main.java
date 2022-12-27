package class36;

public class Main {
    public static void main(String[] args) {
        Patient general = new GeneralPatient();
        Patient child = new ChildPatient();
        Patient senior = new SeniorPatient();
        Patient disabled = new DisabledPatient();

        general.takeTylenol();
        child.takeTylenol();
        senior.takeTylenol();
        disabled.takeTylenol();

        System.out.println(general.takePayment(500,230.4));
        System.out.println(child.takePayment(340.45,234.0));
        System.out.println(senior.takePayment(640,300));
        System.out.println(disabled.takePayment(480.6,238.7));


    }
}
