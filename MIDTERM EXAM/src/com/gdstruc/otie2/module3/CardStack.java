package com.gdstruc.otie2.module3;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.EmptyStackException;

public class CardStack {
    private LinkedList<Card> cardDeck;
    private LinkedList<Card> playerDeck;
    private LinkedList<Card> discardedPile;

    public CardStack() {
        cardDeck = new LinkedList<Card>();
    }

    public void push(Card card) {
        cardDeck.push(card);
    }

    public Card drawCard(){
        return cardDeck.pop();
    }

    public void discardCard(Card card){
        discardedPile.push(card);
    }

    public void retrieveCard(Card card){
        playerDeck.push(card);
    }

    public int randomizeCommand(){
        Random rand = new Random();

        int upperbound = 3;
        int randomCommand = rand.nextInt(upperbound);

        return randomCommand;
    }
    public boolean isEmpty() {
        return playerDeck.isEmpty();
    }

    public void useCommand(){
        if (randomizeCommand() == 0){
            Random rand = new Random();
            int upperbound = 5;

                for (int i = 0; i < rand.nextInt(upperbound); i++){
                    drawCard();

                    System.out.println("Drawing " + (i +1) + " cards...");
                    System.out.println(drawCard());
                }
        }
        else if (randomizeCommand() == 1){
            Random rand = new Random();
            int upperbound = 5;

            if (isEmpty()) {
                throw new EmptyStackException();
            }
            else
                for (int i = 0; i < rand.nextInt(upperbound); i++){

                discardCard(playerDeck.pop());

                System.out.println("Discarding " + (i +1) + " cards...");
                System.out.println(playerDeck.pop());
            }
        }
        else if (randomizeCommand() == 2){
            Random rand = new Random();
            int upperbound = 5;

            if (isEmpty()) {
                throw new EmptyStackException();
            }
            else
                for (int i = 0; i < rand.nextInt(upperbound); i++){
                retrieveCard(discardedPile.pop());

                System.out.println("Discarding " + (i +1) + " cards...");
                System.out.println(discardedPile.pop());
            }
        }
    }

}

