package Pokemons;

import PhysicalAttack.WildCharge;
import StatusAttack.Growl;
import StatusAttack.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level){
        super(name, level);
        setStats(35, 55, 40, 50, 50, 90);
        setType(Type.ELECTRIC);
        setMove(new WildCharge(), new ThunderWave(), new Growl());
    }
}
