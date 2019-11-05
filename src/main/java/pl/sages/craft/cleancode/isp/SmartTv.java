package pl.sages.craft.cleancode.isp;

/**
 * @author krogulecp
 */
class SmartTv implements Tv, Smart {
    @Override
    public void display() {
        System.out.println("Smart tv wyświetla film");
    }

    @Override
    public void connectToInternet() {
        System.out.println("smart tv łączy się z siecią");
    }
    //TODO
}
