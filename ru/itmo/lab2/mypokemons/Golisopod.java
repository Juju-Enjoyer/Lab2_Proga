package ru.itmo.lab2.mypokemons;

import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.mymoves.Focus_Blast;

public class Golisopod extends Wimpod{
    public Golisopod (String name, int level){
        super(name,level);
        setStats(75,125,140,60,90,40);
        setType(Type.BUG, Type.WATER);
        addMove(new Focus_Blast());
    }
}
