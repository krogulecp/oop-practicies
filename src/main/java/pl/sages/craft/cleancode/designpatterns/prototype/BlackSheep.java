package pl.sages.craft.cleancode.designpatterns.prototype;

public class BlackSheep extends Sheep {
    public BlackSheep(String name) {
        super(name);
    }

    @Override
    public Sheep clone() {
        return new BlackSheep(this.getName());
    }
}

