package com.pbo;

public class Main {

    public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player("Dark Lord Hades",2000);
        Player player2 = new Player("Gilgamesh the King of Heroes",1000);

        // membuat object weapon
        Weapon p1Weapon = new Weapon("Eternal Damnation",750);
        Weapon p2Weapon = new Weapon("Gate of Babylon",1250);

        // membuat object armor
        Armor p1Armor = new Armor("Dark Lord Armor",450);
        Armor p2Armor = new Armor("Golden Armor of Uruk",500);

        // player 1
        player1.equipWeapon(p1Weapon);
        player1.equipArmor(p1Armor);
        player1.display();
        System.out.println("\n[Hades : Your Legend Ends here Gilgamesh!]");

        // player 2
        player2.equipWeapon(p2Weapon);
        player2.equipArmor(p2Armor);
        player2.display();
        System.out.println("\n[Gilgamesh : Are you joking? I have defeated something far more powerful than you.]");

        System.out.println("\n[THE WHEEL OF FATE IS TURNING]");
        System.out.println("\n          ACTION!!!");
        System.out.println("\nTurn - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nTurn - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
        System.out.println("\nTurn - 3\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nTurn - 4\n");
        player2.attack(player1);
        player1.display();
        player2.display();
        System.out.println("\nDark Lord Hades have been Defeated\n");
    }
}
