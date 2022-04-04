package Gamein.org;

public class Projectile extends Actor{
    private float speed;
    private int attackPoint;

    public void Projectile(float speed, int attackPoint) {
        setSpeed(speed);
        setAttackPoint(attackPoint);
    }

    void getInfo() {
        System.out.println("-=Status Projectile=-");
        System.out.println("Speed: " + getSpeed());
        System.out.println("Attack Point: " + getAttackPoint());
        System.out.println("-===========-");
    }

    public void checkCollission() {
        if ((speed*getXpos()) == this.attackPoint || (speed*getYpos()) == this.attackPoint) {
            System.out.println("There is a collision");
        }
        else {
            System.out.println("There are no collisions");
        }
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
}
