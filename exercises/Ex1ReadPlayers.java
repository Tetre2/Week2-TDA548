package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Utilities to input/output player data for a command line game
 *
 *  See:
 *  - UseAConstructor
 *  - ObjectArrMeth
 *
 */
public class Ex1ReadPlayers {
    public static void main(String[] args) {
        new Ex1ReadPlayers().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        Player[] players = inputPlayers();
        outPlayers(players);
    }

    // This class captures the concept of a Player
    class Player {
        String name;   // A Player has a name and...
        int points;    // ... and points

        // TODO
    }

    // ---------- Methods -------------------

     Player[] inputPlayers() {
       // TODO
        return null;
    }

    void outPlayers(Player[] players){
       // TODO
    }


}
