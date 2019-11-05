package pl.sages.craft.cleancode.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Game {

    public static void main(String[] args) {
        EnemyFactory factory = new RandomEnemyFactory();
        Enemy raise = factory.raise();

        System.out.println(raise.getClass().getSimpleName());
    }
}
