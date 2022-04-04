package Gamein.org;

abstract class Enemy extends Actor{
    private boolean Isboss;
    private int healthPoint;
    private int moveSpeed;

    public boolean isIsboss() {
        return Isboss;
    }

    public void setIsboss(boolean isboss) {
        this.Isboss = isboss;
    }

    abstract void attack(Avatar avatar);

    abstract void hitTaken(int damage);

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
