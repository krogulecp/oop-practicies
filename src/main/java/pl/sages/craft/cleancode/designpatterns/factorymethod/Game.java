package pl.sages.craft.cleancode.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Game {

    public static void main(String[] args) {
        new World(new RandomEnemyFactory()).prepareWorld();
    }
}
