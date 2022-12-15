package class34;

class IPhone {
    String facetime() {
        String str = "This is FaceTime";
        return str;
    }

    String messages() {
        String str = "This is message";
        return str;
    }
}
class IPhone8 extends IPhone{
    void touchID() {
        System.out.println("This is TouchID");
    }
}
class IPhoneX extends IPhone{
    void faceID() {
        System.out.println("This is FaceID");
    }
}

