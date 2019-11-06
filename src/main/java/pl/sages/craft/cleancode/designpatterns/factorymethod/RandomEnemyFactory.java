package pl.sages.craft.cleancode.designpatterns.factorymethod;

import java.util.Random;

public class RandomEnemyFactory implements EnemyFactory {

    @Override
    public Enemy rise() {
        Random rand = new Random();
        Enemy raisedEnemy;

        int enemyType = rand.nextInt(2);

        switch (enemyType){
            case 0:
            raisedEnemy = new Solidier();
            break;

            case 1:
            raisedEnemy = new Zombie();
            break;

            case 2:
            default:
            raisedEnemy = new Psycho();
            break;
        }
        return raisedEnemy;
    }
}
