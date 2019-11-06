package pl.sages.craft.cleancode.designpatterns.prototype;

public class ConcreteSheep extends Sheep{

    protected ConcreteSheep(String name) {
        super(name);
    }

    public ConcreteSheep clone(){
        ConcreteSheep clonedSheep;
        clonedSheep = new ConcreteSheep(this.name);
        return clonedSheep;
    }

    @Override
    public String toString() {
        return "ConcreteSheep{}" + this.name;
    }
}
