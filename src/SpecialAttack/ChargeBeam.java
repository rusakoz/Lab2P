package SpecialAttack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ChargeBeam extends PhysicalMove {
    public ChargeBeam(){
        super(Type.ELECTRIC, 50 ,90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if(Math.random() <= 0.7){
            pokemon.setMod(Stat.SPECIAL_ATTACK, +1);
        }
    }

    @Override
    protected String describe() {
        return "использовал электролуч";
    }
}
