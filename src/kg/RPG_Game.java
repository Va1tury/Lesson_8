package kg;

import kg.geeks.game.activity.general.players.*;

public class RPG_Game {
   static int roundCounter =0;

    public static void startGame() {
        Boss boss = new Boss(700, 35);
        Warrior warrior = new Warrior(270, 25);
        Magic magic = new Magic(250, 25);
        Berserk berserk = new Berserk(230, 20);
        Medic doc = new Medic(250, 25, 5);
        Medic assistant = new Medic(200, 10, 5);

        Hero[] heroes = {warrior, magic, berserk, doc, assistant};
        printStatics(boss, heroes);
        while (!isGameFinish(boss,heroes)){
            round(boss, heroes);
            roundCounter++;
        }

    }

    private static void heroesApplyAbility(Boss boss, Hero [] heroes){
        for (int i = 0; i <heroes.length ; i++) {

            if (heroes[i].getHealth() > 0 && boss.getHealth() >0);
            heroes[i].applySuperPower(boss,heroes);
        }
    }

    private static void round(Boss boss, Hero []heroes){
        bossHits(boss, heroes);
        heroesHits(boss,heroes);
        heroesApplyAbility(boss, heroes);
        printStatics(boss, heroes);
    }
    private static void heroesHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());

        }

    }
    private static void bossHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth() - heroes[i].getDamage());

        }

    }

    private static boolean isGameFinish(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes WON!!!");
            return true;

        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }

        if (allHeroesDead) {
            System.out.println("Boss Won!!!");

        }
        return allHeroesDead;
    }

    private static void printStatics(Boss boss, Hero[] heroes) {
        System.out.println("**********************");
        System.out.println("ROUND"+ roundCounter);
        System.out.println("Boss health " + boss.getHealth()
                + " " + "Damage: [" + boss.getDamage() + "]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName()+" health: "+
                    heroes[i].getHealth()+" "+"Damage: ["+heroes[i].getDamage()+"]");

        }
        System.out.println();
    }
}
