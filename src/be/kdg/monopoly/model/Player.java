package be.kdg.monopoly.model;
import java.util.ArrayList;

public class Player {
    private int id = 0;
    private String name ;
    private int balance = 1500;
    private String color;

      ArrayList<String> ownedProperties = new ArrayList<>();
    private int score = 0;

    public void setColor(String color) {
        this.color = color;
    }
    public void getColor(String color) {
        this.color = color;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }

    public int getScore() {
        return this.score;
    }

    public void setOwnedProperty(String ownedProperty) {
        this.ownedProperties.add(ownedProperty);
    }


}


