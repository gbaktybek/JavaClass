package class43;

import java.util.HashMap;
import java.util.Map;

enum InputField{
    AMOUNT,
    FROM_ACCOUNT,
    TO_ACCOUNT,
    NOTE;
}
public class EnumExample {
    public static void main(String[] args) {
        System.out.println("Opening a Bank website");
        System.out.println(getDataOnReviewPage());
    }

    public static Map<String, String> getDataOnReviewPage() {
        String fromAcc = "453-234-457-343";
        String toAcc = "3453-34545-324543";
        int amount = 2000;
        String note = "Salary Payment";
        Map<String, String> dataOnReviewPage = new HashMap<>();

//        System.out.println("Entering from account " + fromAcc);
//        System.out.println("Entering to account " + toAcc);
//        System.out.println("Entering amount " + amount);
//        System.out.println("Entering note " + note);

//        dataOnReviewPage.put("from account",fromAcc);
//        dataOnReviewPage.put("to account", toAcc);
//        dataOnReviewPage.put("amount", String.valueOf(amount));
//        dataOnReviewPage.put("note", note);

        dataOnReviewPage.put(InputField.FROM_ACCOUNT.toString(),fromAcc);
        dataOnReviewPage.put(InputField.TO_ACCOUNT.toString(), toAcc);
        dataOnReviewPage.put(InputField.AMOUNT.toString(), String.valueOf(amount));
        dataOnReviewPage.put(InputField.NOTE.toString(), note);
        return dataOnReviewPage;
    }
}


