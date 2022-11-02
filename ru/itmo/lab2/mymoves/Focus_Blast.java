package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.*;

public class Focus_Blast extends SpecialMove {
    public Focus_Blast() {
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (Math.random() < 0.1) {
            def.setMod(Stat.SPECIAL_DEFENSE, -1);

        }
    }

    @Override
    protected String describe(){
        return "исаользует Focus Blast";
    }
}