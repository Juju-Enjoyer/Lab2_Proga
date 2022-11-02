package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Tickle extends StatusMove {
    public Tickle (){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.DEFENSE, -1);
        def.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использует Tickle";
    }
}
