package kg.geeks.game.activity.general.players;

public class Berserk extends  Hero{

    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        int revers = boss.getDamage() / 2;
        boss.setHealth(boss.getHealth() - this.getDamage()+ revers);
        int qwer = this.getDamage()+revers;
        System.out.println("Berserk нанес урон" + " " + qwer);

    }
}

