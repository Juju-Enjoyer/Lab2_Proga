package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Fury_Swipes extends PhysicalMove {

    public Fury_Swipes (){
        super(Type.NORMAL , 18, 80, 1, 2);
        if(Math.random() < 0.375){
            super.hits = 3;
        }

        if(Math.random() < 0.125){
            super.hits = 4;
        }

        if(Math.random() < 0.125){
            super.hits = 5;
        }
    }

    @Override
    protected String describe() {
        return "использует Fury Swipes";
    }

}
