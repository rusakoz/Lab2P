package SpecialAttack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class MoonBlast extends PhysicalMove {
    public MoonBlast(){
        super(Type.FAIRY, 95, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
        }
    }

    @Override
    protected String describe() {
        return "использовал лунный взрыв";
    }
}
