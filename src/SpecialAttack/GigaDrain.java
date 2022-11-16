package SpecialAttack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class GigaDrain extends PhysicalMove {
    public GigaDrain(){
        super(Type.GRASS, 75, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, -(int)(Math.round(damage) * 0.5));
    }

    @Override
    protected String describe() {
        return "использует гига истощение";
    }
}
