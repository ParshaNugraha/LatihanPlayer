package Latihan1;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Sukamti");
        player.setNama();
        Health health = new Health("100.0");
        health.setHealth();
        weapon weapon = new weapon("Pedang","15");
        weapon.setWeapom();
        Armor armor = new Armor("baju besi","10.0");
        armor.show();

        System.out.println("======================================");
        Player player1 = new Player("Budi");
        player.setNama();
        Health health1 = new Health("50.0");
        health.setHealth();
        weapon weapon1 = new weapon("ketapel","1.0");
        weapon.setWeapom();
        Armor armor1 = new Armor("kaos","0.0");
        armor.show();

    }

}
