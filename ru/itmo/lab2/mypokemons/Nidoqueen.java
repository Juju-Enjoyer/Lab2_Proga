package ru.itmo.lab2.mypokemons;

import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.mymoves.Aerial_Ace;

public class Nidoqueen extends Nidorina {
    public Nidoqueen (String name, int level) {
        super(name, level);
        setStats(90, 92, 87, 75, 85, 76 );
        setType(Type.POISON,Type.GROUND);
        addMove(new Aerial_Ace());
    }
}
