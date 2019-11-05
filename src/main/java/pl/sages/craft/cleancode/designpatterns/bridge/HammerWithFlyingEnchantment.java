package pl.sages.craft.cleancode.designpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author krogulecp
 */
class HammerWithFlyingEnchantment implements Weapon, Enchantment {

    private static final Logger LOGGER = LoggerFactory.getLogger(HammerWithFlyingEnchantment.class);

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
