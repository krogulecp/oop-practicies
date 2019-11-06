package pl.sages.craft.cleancode.designpatterns.prototype;

public class BasicSheep extends Sheep {
    public BasicSheep(String name) {
        super(name);
    }
    @Override
    public Sheep makeCopy() {
        return  null;
    }
}
