package class34;

public class TestIPhone {
    public static void main(String[] args) {
        IPhone8 iPhone8 = new IPhone8();
        IPhoneX iPhoneX = new IPhoneX();

        System.out.println(iPhone8.facetime());
        System.out.println(iPhoneX.messages());

        iPhone8.touchID();
        iPhoneX.faceID();

    }
}
