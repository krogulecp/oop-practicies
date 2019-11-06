package pl.sages.craft.cleancode.designpatterns.factorymethod;

public class World {
    private EnemyFactory enemyFactory;
    public World(EnemyFactory enemyFactory){
        this.enemyFactory = enemyFactory;
    }

    public Enemy createNewEnemy(){
        return enemyFactory.rise();
    }
}
