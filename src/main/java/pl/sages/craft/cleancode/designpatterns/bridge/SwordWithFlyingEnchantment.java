package pl.sages.craft.cleancode.designpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author krogulecp
 */
class SwordWithFlyingEnchantment implements Weapon, Enchantment {

    private static final Logger LOGGER = LoggerFactory.getLogger(SwordWithFlyingEnchantment.class);

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
        LOGGER.info("The item begins to glow faintly.");
    }

    @Override
    public void apply() {
        LOGGER.info("The item flies and strikes the enemies finally returning to owner's hand.");
    }

    @Override
    public void onDeactivate() {
        LOGGER.info("The item's glow fades.");
    }
}
