package com.gdstruc.otie2.module3;

public class Main {
    public static void main(String[] args) {

        CardStack cardDeck = new CardStack();
        CardStack playerDeck = new CardStack();
        CardStack discardedPile = new CardStack();

        int cardDeckCount = 30;

        cardDeck.push(new Card("Panorama")); cardDeck.push(new Card("Sequence")); cardDeck.push(new Card("Violeta"));
        cardDeck.push(new Card("Fearless")); cardDeck.push(new Card("Eleven")); cardDeck.push(new Card("Spaceship"));
        cardDeck.push(new Card("Vampire")); cardDeck.push(new Card("Merry-Go-Round")); cardDeck.push(new Card("Daydream"));
        cardDeck.push(new Card("Colors")); cardDeck.push(new Card("Glassy")); cardDeck.push(new Card("Glitch"));
        cardDeck.push(new Card("Hydra")); cardDeck.push(new Card("After Like")); cardDeck.push(new Card("Voltage"));
        cardDeck.push(new Card("Antifragile")); cardDeck.push(new Card("Smiley")); cardDeck.push(new Card("Royal"));
        cardDeck.push(new Card("Celestial")); cardDeck.push(new Card("Swan")); cardDeck.push(new Card("Egoist"));
        cardDeck.push(new Card("Twilight")); cardDeck.push(new Card("Eyes")); cardDeck.push(new Card("Dice"));
        cardDeck.push(new Card("Espresso")); cardDeck.push(new Card("Highlight")); cardDeck.push(new Card("Dreams"));
        cardDeck.push(new Card("Impurities")); cardDeck.push(new Card("Rose")); cardDeck.push(new Card("Stereotype"));

        System.out.println("Drawing a card.. " + cardDeck.drawCard());
        System.out.println();

        System.out.println("Using a random command.. ");
        cardDeck.useCommand();
    }
}