package PhysicalAttack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove{
    public WildCharge(){
        super(Type.ELECTRIC, 90, 100);
    }


    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int)(Math.round(damage) * 2));
    }

    @Override
    protected String describe() {
        return "использовал дикий заряд";
    }
}
