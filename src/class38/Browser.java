package class38;

public interface Browser {
    void closeBrowser();

    void openIncognito();
}

class Chrome implements Browser {

    @Override
    public void closeBrowser() {

    }

    @Override
    public void openIncognito() {
        System.out.println("Ctrl + Shift + T");
    }
}

class FireFox implements Browser {

    @Override
    public void closeBrowser() {

    }

    @Override
    public void openIncognito() {
        System.out.println("Ctrl + Shift + T");
    }
}