package ru.itmo.lab2.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.mymoves.Rest;
import ru.itmo.lab2.mymoves.Struggle_Bug;
import ru.itmo.lab2.mymoves.Waterfall;

public class Wimpod extends Pokemon {
    public Wimpod (String name, int level){
        super(name, level);
        setStats(25, 35, 40, 20, 30, 80);
        setType(Type.BUG, Type.WATER);
        setMove(new Rest(), new Struggle_Bug(), new Waterfall());
    }
}
