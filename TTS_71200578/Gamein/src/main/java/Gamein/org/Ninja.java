package Gamein.org;

public class Ninja extends Enemy{
    private Weapon weapon;

    public Ninja(boolean boss, int healthPoint, Weapon weapon, int speed) {
        setIsboss(boss);
        setHealthPoint(healthPoint);
        setWeapon(weapon);
        setMoveSpeed(speed);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack(Avatar avatar) {
        if (weapon.isDisable() == false) {
            avatar.hitTaken(weapon.getHitDamage());
            weapon.setDurability(weapon.getDurability() - 1);
        }
    }

    void hitTaken(int damage) {
        setHealthPoint(getHealthPoint()-damage);
    }

    void getInfo() {
        if (isIsboss() == true) {
            System.out.println("-=Status Ninja Boss=-");
        }
        else {
            System.out.println("-=Status Ninja=-");
        }
        System.out.println("Health Point: " + getHealthPoint());
        System.out.println("Weapon Name: " + weapon.getName());
        System.out.println("Weapon Durability: " + weapon.getDurability());
        System.out.println("PosX: " + getXpos());
        System.out.println("PosY: " + getYpos());
        System.out.println("Move Speed: " + getMoveSpeed());
        System.out.println("-===========-");
    }


}
