package pl.sages.craft.cleancode.designpatterns.factorymethod;

import java.util.Random;

public class RandomEnemyFactory implements EnemyFactory<Enemy> {
    @Override
    public Enemy rise() {
        Random seed = new Random();
        Enemy enemy;
        int value = seed.nextInt(3);
        System.out.println(value);
        switch (value) {
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
