package SpecialAttack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Absorb extends PhysicalMove {
    public Absorb(){
        super(Type.GRASS, 20, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, -(int)(Math.round(damage) * 0.5));
    }

    @Override
    protected String describe() {
        return "использовал поглощение";
    }
}
