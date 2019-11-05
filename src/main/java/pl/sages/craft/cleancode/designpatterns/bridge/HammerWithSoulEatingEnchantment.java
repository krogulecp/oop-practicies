package pl.sages.craft.cleancode.designpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author krogulecp
 */
class HammerWithSoulEatingEnchantment implements Weapon, Enchantment {

    private static final Logger LOGGER = LoggerFactory.getLogger(HammerWithSoulEatingEnchantment.class);

    @Override
    public void wield() {
        LOGGER.info("The hammer is wielded.");
        onActivate();
    }

    @Override
    public void swing() {
        LOGGER.info("The hammer is swinged.");
        apply();
    }

    @Override
    public void unwield() {
        LOGGER.info("The hammer is unwielded.");
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
