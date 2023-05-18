package kg.geeks.game.activity.general.players;

public class Magic extends Hero{


    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.MAGIC_POWER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero){
        int plusDamage = 5;
        for (int i = 0; i < hero.length; i++) {
            hero[i].setDamage(hero[i].getDamage() + plusDamage);
            System.out.println("Magic увеличивает урон " + hero[i].getClass().getSimpleName() + " "  + plusDamage);
        }
    }
}
