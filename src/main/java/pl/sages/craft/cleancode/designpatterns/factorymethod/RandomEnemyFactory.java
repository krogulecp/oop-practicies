package pl.sages.craft.cleancode.designpatterns.factorymethod;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author krogulecp
 */
class RandomEnemyFactory implements EnemyFactory {

    private static final Map<Integer, Class<? extends Enemy>> ENEMY_MAP = new HashMap<>();
    private final Random random;
    static {
        ENEMY_MAP.put(0, Zombie.class);
        ENEMY_MAP.put(1, Psycho.class);
        ENEMY_MAP.put(2, Solidier.class);
    }

    public RandomEnemyFactory() {
        this.random = new Random();
    }

    @Override
    public Enemy raise() {

        Enemy enemy = null;

        Class<? extends Enemy> enemyClass = ENEMY_MAP.get(random.nextInt(3));

        try {
            enemy = enemyClass.getConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return enemy;
    }
}
