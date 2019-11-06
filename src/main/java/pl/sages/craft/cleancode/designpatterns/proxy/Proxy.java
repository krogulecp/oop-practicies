package pl.sages.craft.cleancode.designpatterns.proxy;

public class Proxy extends IvoryTower implements WizardTower {
    static int licznik=0;

    @Override
    public void enter(Wizard wizard) {
        licznik++;
        if (licznik<=3){
            super.enter(wizard);
        }

    }
}
