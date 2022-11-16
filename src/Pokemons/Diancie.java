package Pokemons;

import PhysicalAttack.Facade;
import SpecialAttack.AncientPower;
import StatusAttack.Confide;
import StatusAttack.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Diancie extends Pokemon {
    public Diancie(String name, int level){
        super(name, level);
        setStats(50, 100, 150, 100, 150, 50);
        setType(Type.ROCK, Type.FAIRY);
        setMove(new Facade(), new Swagger(), new AncientPower(), new Confide());
    }
}
