package pl.sages.craft.cleancode.designpatterns.bridgeWIthBridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author krogulecp
 */
class Hammer implements Weapon {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hammer.class);

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    private final Enchantment enchantment;

    @Override
    public void wield() {
        LOGGER.info("The hammer is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        LOGGER.info("The hammer is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        LOGGER.info("The hammer is unwielded.");
        enchantment.onDeactivate();
    }
}
