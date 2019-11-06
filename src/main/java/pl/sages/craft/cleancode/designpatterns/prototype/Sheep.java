package pl.sages.craft.cleancode.designpatterns.prototype;

/**
 * @author krogulecp
 */
abstract class Sheep {
    private final String name;

    protected Sheep(String name) {
        this.name = name;
    }

    public abstract Sheep makeCopy();

}
