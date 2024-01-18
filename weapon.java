package Latihan1;

public class weapon {
    String weapom;
    String attack;

    weapon(String inputweapon, String inputAttack){
        this.weapom = inputweapon;
        this.attack = inputAttack;
    }

    void setWeapom(){
        System.out.println("Weapon :" + this.weapom +","+ "Attack :" +this.attack);
    }
}
