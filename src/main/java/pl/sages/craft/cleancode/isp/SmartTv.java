package pl.sages.craft.cleancode.isp;

/**
 * @author krogulecp
 */
class SmartTv implements Tv, Smart {
    @Override
    public void connectToInternet() {
        System.out.printf("łączę się z Internetem");
    }

    @Override
    public void display() {
        System.out.println("Wyświetlam obraz na SmartTV");
    }
}
