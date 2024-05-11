package homework_2024_05_03_exc1_SoliterApp;

import java.util.*;

public class Deck {
    private List<Card> cards =  new ArrayList<>();

    public Deck() {
      init();
    }

    private void init() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(cards);
    }

   public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalArgumentException("Deck is empty");
        }
        return cards.remove(0);
    }

   public List<Card> getCards() {
    return cards;
   }
}






