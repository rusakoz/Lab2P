package Pokemons;

import SpecialAttack.Absorb;
import SpecialAttack.ChargeBeam;
import SpecialAttack.GigaDrain;
import SpecialAttack.MoonBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shiinotic extends Pokemon {
    public Shiinotic(String name, int level){
        super(name, level);
        setStats(60, 45, 80, 90, 100, 30);
        setType(Type.GRASS, Type.FAIRY);
        setMove(new MoonBlast(), new Absorb(), new GigaDrain(), new ChargeBeam());
    }
}
