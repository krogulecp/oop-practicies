package pl.sages.craft.cleancode.designpatterns.factorymethod;

public class World {
    public static void main(String[] args) {
        EnemyFactory factory = new RandomEnemyFactory();
        System.out.println(factory.rise());
    }
}
