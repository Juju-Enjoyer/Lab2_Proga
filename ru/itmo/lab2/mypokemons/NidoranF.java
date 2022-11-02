package ru.itmo.lab2.mypokemons;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.mymoves.*;
import ru.ifmo.se.pokemon.Pokemon;

public class NidoranF extends Pokemon{
    public NidoranF (String name, int level){
        super(name,level);
        setStats(55, 47, 52, 40, 40, 41);
        setType(Type.POISON);
        setMove(new Rest(), new Confide());
    }
}
