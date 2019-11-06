package pl.sages.craft.cleancode.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        EnemyFactory factory = new RandomEnemyFactory();
        World world = new World(factory);
        System.out.println(world.createNewEnemy());
    }
}
