package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WarGame extends Game
{
    public void startGame()
    {
        System.out.println("Welcome to the Card Game War!");
        System.out.println("There are 2 players for this game.");
        System.out.println();

        super.playerOne = new Player("Bill", new Deck().generateDeck(5));
        super.playerTwo = new Player("Mandy", new Deck().generateDeck(5));

        int score1 = 1;
        int score2 = 1;

        for(int i = 0; i < super.playerOne.getHand().size(); i++)
        {
            System.out.println(super.playerOne.getName() + " your card is a " + super.playerOne.getHand().get(i));
            System.out.println(super.playerTwo.getName() + " your card is a " +super.playerTwo.getHand().get(i));

            int playerOneCardValue = super.playerOne.getHand().get(i).getValue().getValue();
            int playerTwoCardValue = super.playerTwo.getHand().get(i).getValue().getValue();

            checkScore(playerOneCardValue, playerTwoCardValue, score1, score2);

            System.out.println();
        }

        checkStandings();
    }

    public void checkScore(int playerOneCardValue, int playerTwoCardValue, int score1, int score2)
    {
        if(playerOneCardValue > playerTwoCardValue)
        {
            System.out.println("Nice! " + super.playerOne.getName() + " you won this round.");
            super.playerOne.setScore(score1++);
        }
        if(playerOneCardValue < playerTwoCardValue)
        {
            System.out.println("Nice! " + super.playerTwo.getName() + " you won this round.");
            super.playerTwo.setScore(score2++);
        }
        if(playerOneCardValue == playerTwoCardValue)
        {
            System.out.println("issa tie");
        }
    }

    @Override
    public void resetGame()
    {
        super.playerOne = new Player();
        super.playerTwo = new Player();
    }

    @Override
    public void tieMessage()
    {
        System.out.println("Looks like there is a tie, we have chosen your tie breaking cards");
        ArrayList<Card> playerOnesTie = new Deck().generateDeck(1);
        System.out.println(super.playerOne.getName() + " your card's value is " + playerOnesTie.get(0).getValue() + " better hope "
                + super.playerTwo.getName() + " doesn't have a higher card");

        super.playerOne.setScore(playerOnesTie.get(0).getValue().getValue());
        System.out.println(super.playerTwo.getName() + " we have selected your card, to keep it suspenseful, we wont tell you your card...");
        ArrayList<Card> playerTwoTie = new Deck().generateDeck(1);
        super.playerTwo.setScore(playerTwoTie.get(0).getValue().getValue());
        System.out.println();
        checkStandings();
    }


    public void checkStandings()
    {
        if(super.playerOne.getScore() > super.playerTwo.getScore())
        {
            System.out.println(super.winnerMessage(super.playerOne));
            System.out.println(super.losingMessage(super.playerTwo));
        }
        else if(super.playerTwo.getScore() > super.playerOne.getScore())
        {
            System.out.println(super.winnerMessage(super.playerTwo));
            System.out.println(super.losingMessage(super.playerOne));
        }
        else
        {
            tieMessage();
        }
    }

    public static void main(String[] args)
    {
        new WarGame().startGame();
    }
}
