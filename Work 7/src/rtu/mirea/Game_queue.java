package rtu.mirea;

import java.util.LinkedList;

public class Game_queue {
    private int Deck[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, iteration = 0;
    private LinkedList<Integer> cards1, cards2;

    public Game_queue() {
        cards1 = new LinkedList<>();
        cards2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            int j = (int)(Math.random() * (10 - i));
            cards1.add(Deck[j]);
            int temp = Deck[9 - i];
            Deck[9 - i] = Deck[j];
            Deck[j] = temp;
        }
        for (int i = 0; i < 5; i++)
            cards2.add(Deck[i]);
    }
    public void Start_game() {
        while (iteration < 106) {
            System.out.print("Cards of first player: ");
            Print(cards1);
            System.out.print("Cards of second player: ");
            Print(cards2);
            int card1 = cards1.poll(), card2 = cards2.poll();
            if (card1 > card2) {
                if (card2 == 0 && card1 == 9) {
                    cards2.add(card1);
                    cards2.add(card2);
                }
                else {
                    cards1.add(card1);
                    cards1.add(card2);
                }
            }
            else {
                if (card1 == 0 && card2 == 9) {
                    cards1.add(card1);
                    cards1.add(card2);
                }
                else {
                    cards2.add(card1);
                    cards2.add(card2);
                }
            }
            if (cards1.size() == 0) {
                System.out.print("second " + iteration);
                return;
            }
            else if (cards2.size() == 0) {
                System.out.print("first " + iteration);
                return;
            }
            iteration++;
        }
        System.out.print("botva " + iteration);
    }

    private void Print(LinkedList<Integer> cards) {
        LinkedList<Integer> temp = new LinkedList<>();
        int card, length = cards.size();
        for (int i = 0; i < length; i++) {
            card = cards.poll();
            temp.add(card);
            System.out.print(card + " ");
        }
        System.out.println("");
        for (int i = 0; i < length; i++)
            cards.add(temp.poll());
    }
}
