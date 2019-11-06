package pl.sages.craft.cleancode.grasp.indirection;

/**
 * @author krogulecp
 */
class EnemyTank implements EnemyAttacker {
    @Override
    public void attack() {
        System.out.println("Czołg wystrzelił pocisk");
    }
}
