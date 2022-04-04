package Gamein.org;

public class Avatar extends Actor implements IMoveable, IKeyInput{
    private String Name;
    private int healthPoint;
    private int moveSpeed;
    private Weapon weapon;

    public Avatar(String name, int healthPoint, Weapon weapon, int speed) {
        this.Name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.moveSpeed = speed;
    }

    public void attack(Warlock warlock) {
        if (weapon.isDisable() == false) {
            warlock.hitTaken(weapon.getHitDamage());
            weapon.setDurability(weapon.getDurability() - 1);
        }
    }

    public void attack(Ninja ninja) {
        if (weapon.isDisable() == false) {
            ninja.hitTaken(weapon.getHitDamage());
            weapon.setDurability(weapon.getDurability() - 1);
        }
    }

    public void hitTaken(int damage) {
        this.healthPoint -= damage;
    }

    public void move(float posX, float negX) {
        setXpos(getXpos() + posX);
        setXpos(getXpos() - negX);
    }

    public void jump(float value) {
        setYpos(getYpos() + value);
    }

    public void keyPressed(int key) {
        if (key == 0) {
            move(moveSpeed,0);
        }
        else if (key == 1) {
            move(0,moveSpeed);
        }
        else if (key == 2) {
            jump(moveSpeed);
        }
        else if (key == 3) {
            int speed = this.moveSpeed * -1;
            jump(speed);
        }
    }

    public void keyReleased(int key) {
        System.out.println(this.Name + " is Idle");
    }

    void getInfo() {
        System.out.println("-=Status Avatar=-");
        System.out.println("Name: " + this.Name);
        System.out.println("Health Point: " + this.healthPoint);
        System.out.println("Weapon Name: " + this.weapon.getName());
        System.out.println("Weapon Durability: " + this.weapon.getDurability());
        System.out.println("PosX: " + getXpos());
        System.out.println("PosY: " + getYpos());
        System.out.println("Move Speed: " + this.moveSpeed);
        System.out.println("-===========-");
    }
}
