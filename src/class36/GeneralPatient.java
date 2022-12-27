package class36;

public class GeneralPatient extends Patient{
    public void takeTylenol() {
        System.out.println("Your recommended dose is 250mg");
    }
    public double takePayment(double balance, double amountReceived){
        //no discount
        double remainingBalance;
        remainingBalance=balance-amountReceived;

        return remainingBalance;
    }
}
