package be.kdg.monopoly;

import be.kdg.monopoly.model.Player;

import java.awt.*;
import java.util.ArrayList;

public class Monopoly {
        public static void main(String[] args) {
            Monopoly monopoly = new Monopoly();

            Player player1 = new Player();
            player1.setName("John Doe");
            player1.setId(1);
            player1.getBalance();
            player1.setColor(String.valueOf(Color.YELLOW));

            Player player2 = new Player();
            player2.setName("Jane Doe");
            player2.setId(2);
            player2.getBalance();
            player2.setColor(String.valueOf(Color.GREEN));

            Player player3 = new Player();
            player3.setName("Jack Doe");
            player3.setId(3);
            player3.getBalance();
            player3.setColor(String.valueOf(Color.RED));

        }
    }