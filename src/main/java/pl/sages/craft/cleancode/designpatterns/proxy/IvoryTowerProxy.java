package pl.sages.craft.cleancode.designpatterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IvoryTowerProxy implements WizardTower{
    private static final Logger LOGGER = LoggerFactory.getLogger(IvoryTower.class);
    private IvoryTower tower;
    private int howManyLeft = 3;

    public IvoryTowerProxy(IvoryTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (howManyLeft > 0){
            howManyLeft--;
            tower.enter(wizard);
        }
        else {
            LOGGER.info("Liczba czarodziejów w wieży osiągnęła maksimum");
        }
    }
}
