package pl.sages.craft.cleancode.designpatterns.factorymethod;

import sun.java2d.opengl.WGLSurfaceData;

import java.util.stream.IntStream;

public class World {
    private EnemyFactory enemyFactory;
    public World(EnemyFactory enemyFactory){
        this.enemyFactory = enemyFactory;
    }

    public Enemy createNewEnemy(){
        return enemyFactory.rise();
    }

    void createWorld(){
        IntStream.iterate(0, i -> i+1)
                .forEach(i -> System.out.println(enemyFactory.rise().getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        World world = new World(new RandomEnemyFactory());
        world.createWorld(); // nieskończone generowanie
    }

}
