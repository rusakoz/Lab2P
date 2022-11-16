import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class vs{
    public static void main(String[] args){
        Battle battle = new Battle();
        battle.addAlly(new Diancie("Дианция", 1));
        battle.addAlly(new Morelull("Мэрилун", 1));
        battle.addAlly(new Shiinotic("Шиморо", 1));
        battle.addFoe(new Pichu("Пикху", 1));
        battle.addFoe(new Raichu("Раикху", 1));
        battle.addFoe(new Pikachu("Пикакху", 1));
        battle.go();
    }
}
