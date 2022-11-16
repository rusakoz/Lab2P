package Pokemons;

import SpecialAttack.Absorb;
import SpecialAttack.GigaDrain;
import SpecialAttack.MoonBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Morelull extends Pokemon {
    public Morelull(String name, int level){
        super(name, level);
        setStats(40, 35, 55, 65, 75, 15);
        setType(Type.GRASS, Type.FAIRY);
        setMove(new MoonBlast(), new Absorb(), new GigaDrain());
    }
}
