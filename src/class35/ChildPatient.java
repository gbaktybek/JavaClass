package class35;

public class ChildPatient extends Patient{
    public void takeTylenol() {
        System.out.println("Your recommended dose is 50mg");
    }
    public double takePayment(double balance, double amountReceived){
        double discount = 0.1;
        //balance after discount
        balance = balance - balance * discount;
        double remainingBalance;
        remainingBalance=balance-amountReceived;

        return remainingBalance;
    }

}
