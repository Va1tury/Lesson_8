package kg.geeks.game.activity.general.players;

public class Thor extends Hero{

    public Thor(int health, int damage, SuperAbility superAbility) {
        super(health, damage,SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        

    }
}
