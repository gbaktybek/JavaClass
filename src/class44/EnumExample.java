package class44;

enum Days{
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    int day;
    Days(int day) {
        this.day=day;
    }

//    @Override
//    public String toString() {
//        return String.valueOf(day);
//    }

    public int getDayNum() {
        return day;
    }
}

public class EnumExample {
    public static void main(String[] args) {
//        System.out.println(Days.TUESDAY.toString());
        System.out.println(Days.TUESDAY.getDayNum());
    }
}
