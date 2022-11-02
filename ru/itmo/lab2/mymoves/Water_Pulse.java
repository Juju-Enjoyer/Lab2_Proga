package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Water_Pulse extends SpecialMove {
    public Water_Pulse(){
        super(Type.WATER, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (Math.random()<0.2){
            Effect.confuse(def);
        }
    }
    @Override
    protected String describe(){
        return "использует Water Pulse";
    }
}
