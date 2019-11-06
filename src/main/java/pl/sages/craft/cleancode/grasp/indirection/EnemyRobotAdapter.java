package pl.sages.craft.cleancode.grasp.indirection;

/**
 * @author krogulecp
 */
class EnemyRobotAdapter implements EnemyAttacker {

    private final EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void attack() {
        enemyRobot.jumpOnEnemy();
    }
}
