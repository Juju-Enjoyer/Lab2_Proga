package ru.itmo.lab2.mypokemons;

import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.mymoves.Fury_Swipes;

public class Nidorina extends NidoranF {
    public Nidorina (String name, int level) {
        super(name, level);
        setStats(70, 62, 67, 55, 55, 56);
        setType(Type.POISON);
        addMove(new Fury_Swipes());

    }
}
