package be.kdg.monopoly.model;

public class Dice {
    private final int dice = (int) (Math.random() * 6 + 1);

    public int getDice() {
        return dice;
    }
}
