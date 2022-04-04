package Gamein.org;

public class Weapon {
    private int durability;
    private String name;
    private boolean isDisable;
    private int hitDamage;

    public Weapon(String name, int hitDamage,int durability) {
        setName(name);
        setHitDamage(hitDamage);
        setDurability(durability);
        if (durability <= 0) {
            setDisable(true);
        }
        else {
            setDisable(false);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public void setDisable(boolean disable) {
        isDisable = disable;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(int hitDamage) {
        this.hitDamage = hitDamage;
    }
}
