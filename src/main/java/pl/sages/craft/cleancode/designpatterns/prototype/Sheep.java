package pl.sages.craft.cleancode.designpatterns.prototype;

import java.util.Objects;

/**
 * @author krogulecp
 */
abstract class Sheep {
    private final String name;

    protected Sheep(String name) {
        this.name = name;
    }

    abstract Sheep makeCopy();

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheep sheep = (Sheep) o;
        return Objects.equals(name, sheep.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
