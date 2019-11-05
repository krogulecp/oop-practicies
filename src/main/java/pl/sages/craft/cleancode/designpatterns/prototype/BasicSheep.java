package pl.sages.craft.cleancode.designpatterns.prototype;

/**
 * @author krogulecp
 */
class BasicSheep extends Sheep {
    protected BasicSheep(String name) {
        super(name);
    }

    private BasicSheep(Sheep sheep){
        super(sheep.getName());
    }

    @Override
    Sheep makeCopy() {
        return new BasicSheep(this);
    }
}
