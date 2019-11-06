package pl.sages.craft.cleancode.designpatterns.factorymethod;

import java.util.stream.IntStream;

/**
 * @author krogulecp
 */
class World {
    private final EnemyFactory enemyFactory;

    World(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    void prepareWorld(){
        IntStream.iterate(0, i -> i + 1)
                .forEach(i -> System.out.println(enemyFactory.raise()));
    }
}
