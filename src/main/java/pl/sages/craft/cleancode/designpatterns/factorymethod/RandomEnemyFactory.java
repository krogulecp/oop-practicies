package pl.sages.craft.cleancode.designpatterns.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author krogulecp
 */
class RandomEnemyFactory implements EnemyFactory {

    private final Map<Integer, Class<? extends Enemy>> enemyMap;
    private final Random random;

    RandomEnemyFactory() {
        this.enemyMap = new HashMap<>();
        this.random = new Random();
        enemyMap.put(0, Solidier.class);
        enemyMap.put(1, Zombie.class);
        enemyMap.put(2, Psycho.class);
    }

    @Override
    public Enemy raise() {
        Class<? extends Enemy> aClass = enemyMap.get(random.nextInt(3));

        Enemy enemy = null;
        try {
            enemy = aClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return enemy;
    }
}
