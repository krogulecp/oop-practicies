package pl.sages.craft.cleancode.grasp.indirection;

/**
 * @author krogulecp
 */
class Main {
    public static void main(String[] args) {
        EnemyAttacker enemy = new EnemyTank();
        enemy.attack();
    }
}
