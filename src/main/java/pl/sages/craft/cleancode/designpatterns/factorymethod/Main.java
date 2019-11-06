package pl.sages.craft.cleancode.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args) {

        World world = new World(new RandomEnemyFactory());
        for (int i = 0; i < 10; i++) {
            System.out.println(world.createNewEnemy().getName());
        }
    }
}
