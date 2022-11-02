package ru.itmo.lab2;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.itmo.lab2.mypokemons.*;


public class Main_battel {
    public static void main(String[] args) {
        Battle game = new Battle();
        game.addAlly(new Alomomola("Rosa", 20));
        game.addAlly(new Golisopod("RockLi", 35));
        game.addAlly(new NidoranF("Fific", 5));


        game.addFoe(new Nidoqueen("King", 30));
        game.addFoe(new Wimpod("Clop", 10));
        game.addFoe(new Nidorina("NotKing", 20));

        game.go();
    }

}