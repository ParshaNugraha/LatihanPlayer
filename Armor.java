package Latihan1;

public class Armor {
    String Armor;
    String Defence;

    Armor(String inputArmor, String inputDefence){
        this.Armor = inputArmor;
        this.Defence = inputDefence;
    }
    void show(){
        System.out.println("Armor: " + this.Armor + "," + "Defence: " + this.Defence);
    }
}
