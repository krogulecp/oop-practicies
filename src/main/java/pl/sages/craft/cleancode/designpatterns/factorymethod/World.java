package pl.sages.craft.cleancode.designpatterns.factorymethod;

import java.util.stream.IntStream;

/**
 * @author krogulecp
 */
class World {
    private final EnemyFactory enemyFactory;

    public World(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    void createWorld(){
        IntStream.iterate(0, i -> i+1)
                .forEach(i -> System.out.println(enemyFactory.raise().getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        World world = new World(new RandomEnemyFactory());
        world.createWorld();
    }
}
