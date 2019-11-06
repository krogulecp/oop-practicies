package pl.sages.craft.cleancode.designpatterns.factorymethod;

import java.util.Random;

public class RandomEnemyFactory implements EnemyFactory {
    private final Random seed;

    public RandomEnemyFactory() {
        seed = new Random();
    }

    @Override
    public Enemy rise() {
        Enemy enemy;
        switch (seed.nextInt(3)) {
            case 0:
                enemy = new Psycho();
                break;
            case 1:
                enemy = new Soldier();
                break;
            default:
                enemy = new Zombie();
                break;
        }
        return enemy;
    }
}
