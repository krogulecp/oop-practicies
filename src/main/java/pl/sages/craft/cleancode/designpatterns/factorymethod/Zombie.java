package pl.sages.craft.cleancode.designpatterns.factorymethod;

import java.util.zip.ZipOutputStream;

/**
 * @author krogulecp
 */
class Zombie extends Enemy {
    private static final String NAME = "Zombie";
    private static final int POWER = 67;
    public Zombie() {
        super(NAME, POWER);
    }
}
