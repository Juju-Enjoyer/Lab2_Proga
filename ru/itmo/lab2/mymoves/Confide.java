package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide ( ) {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.SPECIAL_ATTACK,-1);
    }

    @Override
    protected String describe() {
        return "использует Confide";
    }

}

