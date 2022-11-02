package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.*;




public class Wake_Up_Slap extends PhysicalMove {
    public Wake_Up_Slap (){
        super(Type.FIGHTING, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status defCon = def.getCondition();
        if (defCon.equals(Status.SLEEP)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
            def.setCondition(new Effect());
        }
        else def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe() {
        return "исользует Wake Up Slap";
    }
}
