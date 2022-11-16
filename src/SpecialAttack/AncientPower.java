package SpecialAttack;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends PhysicalMove {
    public AncientPower(){
        super(Type.ROCK, 60, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1){
            pokemon.setMod(Stat.ATTACK, +1);
            pokemon.setMod(Stat.ACCURACY, +1);
            pokemon.setMod(Stat.DEFENSE, +1);
            pokemon.setMod(Stat.EVASION, +1);
            pokemon.setMod(Stat.SPECIAL_ATTACK, +1);
            pokemon.setMod(Stat.SPECIAL_DEFENSE, +1);
            pokemon.setMod(Stat.SPEED, +1);
        }
    }

    @Override
    protected String describe() {
        return "использовал древнюю силу";
    }
}
