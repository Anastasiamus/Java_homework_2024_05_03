package homework_2024_05_03_exc1_SoliterApp;

import java.util.*;

public class SoliterApp {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Stack<Card> stack = new Stack<>();

        for (Card card : deck.getCards()) {
            if (!stack.isEmpty() && stack.peek() == card) {
                continue;
            }
            stack.push(card);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

