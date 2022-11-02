package ru.itmo.lab2.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.mymoves.Blizzard;
import ru.itmo.lab2.mymoves.Tickle;
import ru.itmo.lab2.mymoves.Wake_Up_Slap;
import ru.itmo.lab2.mymoves.Water_Pulse;

public class Alomomola extends Pokemon {
    public Alomomola(String name, int level) {
        super(name, level);
        setStats(165, 75,80, 40, 45,65);
        setType(Type.WATER);
        setMove(new Blizzard(), new Water_Pulse(), new Wake_Up_Slap(), new Tickle());
    }

}
