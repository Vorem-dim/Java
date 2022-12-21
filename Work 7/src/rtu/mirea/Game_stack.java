package rtu.mirea;

import java.util.Stack;

public class Game_stack {
    private int Deck[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, iteration = 0;
    private Stack<Integer> cards1, cards2;

    public Game_stack() {
        cards1 = new Stack<>();
        cards2 = new Stack<>();
        for (int i = 0; i < 5; i++) {
            int j = (int)(Math.random() * (10 - i));
            cards1.push(Deck[j]);
            int temp = Deck[9 - i];
            Deck[9 - i] = Deck[j];
            Deck[j] = temp;
        }
        for (int i = 0; i < 5; i++)
            cards2.push(Deck[i]);
    }
    public void Start_game() {
        while (iteration < 106) {
            System.out.print("Cards of first player: ");
            Print(cards1);
            System.out.print("Cards of second player: ");
            Print(cards2);
            int card1 = cards1.pop(), card2 = cards2.pop();
            if (card1 > card2) {
                if (card2 == 0 && card1 == 9)
                    The_stack(card1, card2, cards2);
                else
                    The_stack(card1, card2, cards1);
            }
            else {
                if (card1 == 0 && card2 == 9)
                    The_stack(card1, card2, cards1);
                else
                    The_stack(card1, card2, cards2);
            }
            if (cards1.empty()) {
                System.out.print("second " + iteration);
                return;
            }
            else if (cards2.empty()) {
                System.out.print("first " + iteration);
                return;
            }
            iteration++;
        }
        System.out.print("botva " + iteration);
    }

    private void The_stack(int card1, int card2, Stack<Integer> cards) {
        Stack<Integer> temp = new Stack<>();
        int length = cards.size();
        for (int i = 0; i < length; i++)
            temp.push(cards.pop());
        cards.push(card2);
        cards.push(card1);
        for (int i = 0; i < length; i++)
            cards.push(temp.pop());
    }
    private void Print(Stack<Integer> cards) {
        Stack<Integer> temp = new Stack<>();
        int card, length = cards.size();
        for (int i = 0; i < length; i++) {
            card = cards.pop();
            temp.push(card);
            System.out.print(card + " ");
        }
        System.out.println("");
        for (int i = 0; i < length; i++)
            cards.push(temp.pop());
    }
}
