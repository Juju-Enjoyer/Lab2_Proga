package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.*;


public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects (Pokemon attacker){
        attacker.restore();
        Effect slp = new Effect().condition(Status.SLEEP).turns(2);
        attacker.addEffect(slp);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}