package pl.sages.craft.cleancode.designpatterns.prototype;

/**
 * @author krogulecp
 */
abstract class Sheep {
    public String getName() {
        return name;
    }

    private final String name;

    protected Sheep(String name) {
        this.name = name;
    }

    public abstract Sheep clone();
}
