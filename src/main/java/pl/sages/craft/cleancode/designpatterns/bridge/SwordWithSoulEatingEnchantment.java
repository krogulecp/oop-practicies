package pl.sages.craft.cleancode.designpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author krogulecp
 */
class SwordWithSoulEatingEnchantment implements Weapon, Enchantment {

    private static final Logger LOGGER = LoggerFactory.getLogger(SwordWithSoulEatingEnchantment.class);

    @Override
    public void wield() {
        LOGGER.info("The sword is wielded.");
        onActivate();
    }

    @Override
    public void swing() {
        LOGGER.info("The sword is swinged.");
        apply();
    }

    @Override
    public void unwield() {
        LOGGER.info("The sword is unwielded.");
        onDeactivate();
    }

    @Override
    public void onActivate() {
        LOGGER.info("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        LOGGER.info("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactivate() {
        LOGGER.info("Bloodlust slowly disappears.");
    }

}
