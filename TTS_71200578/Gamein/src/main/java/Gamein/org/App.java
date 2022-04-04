package Gamein.org;

public class App
{
    public static void main(String args[]) {
        // intiate avatar dan enemy
        Avatar avatar = new Avatar("myAvatar", 100,
                new Weapon("Golden Arrow", 20, 100), 4);
        avatar.setXpos(50);
        avatar.setYpos(50);
        Ninja ninja = new Ninja(false, 100,
                new Weapon("Tanto Short Sword", 20, 100), 10);
        Warlock warlock = new Warlock(false, 80,
                new Weapon("Vodoo Staff", 15, 100), 5);
        // dapatkan status awal Actor
        System.out.println("STATUS AWAL");
        avatar.getInfo();
        System.out.println("");
        warlock.getInfo();
        System.out.println("");
        ninja.getInfo();
        System.out.println("");
        // simulasikan input keyboard dari player
        avatar.keyPressed(0);
        avatar.keyPressed(2);
        // simulasikan avatar menyerang enemy
        avatar.attack(ninja);
        avatar.attack(warlock);
        // simulasikan avatar mendapatkan serangan
        ninja.attack(avatar);
        // dapatkan status akhir Actor
        System.out.println("STATUS AKHIR");
        avatar.getInfo();
        System.out.println("");
        warlock.getInfo();
        System.out.println("");
        ninja.getInfo();
    }
}
