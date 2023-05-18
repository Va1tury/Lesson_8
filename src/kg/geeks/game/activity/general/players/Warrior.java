package kg.geeks.game.activity.general.players;

import java.util.Random;

public class Warrior extends Hero{


    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        if(boss.getHealth() > 0){
            Random random = new Random();
            int rand= random.nextInt(4)+2;
            boss.setHealth(boss.getHealth()- this.getDamage() * rand);
            System.out.println("Warrior critical damage hits boss" + this.getDamage() * rand );
        }

    }
}
