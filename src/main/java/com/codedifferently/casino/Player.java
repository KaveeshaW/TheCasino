package com.codedifferently.casino;

import java.util.ArrayList;

public class Player {
    // declaring variables
    private String name;
    private double money;
    private int score;
    ArrayList<Card> hand;

    // overloading constructor
    public Player() {
        name = "Unknown Name";
        money = 0.00;
        score = 0;
        hand = new ArrayList<>();
    }

    public Player(String name) {
        this();
        this.name = name;
    }

    public Player(double money) {
        this();
        this.money = money;
    }

    public Player(String name, double money) {
        this();
        this.name = name;
        this.money = money;
    }

    public Player(String name, ArrayList<Card> hand)
    {
        this.name = name;
        this.hand = hand;
    }

    public Player(String name, double money, ArrayList<Card> hand)
    {
        this.name = name;
        this.money = money;
        this.hand = hand;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getScore()
    {
        return this.score;
    }
    public void setScore(int score)
    {
        this.score = score;
    }

    public ArrayList<Card> getHand()
    {
        return this.hand;
    }

    public void setHand(ArrayList<Card> hand)
    {
        this.hand = hand;
    }
}
