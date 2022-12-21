package rtu.mirea;

public class Human {
    class Head {
        private String hair;
        public Head(String hair) { this.hair = hair; }
    }
    class Hand {
        private int count;
        public Hand(int count) { this.count = count; }
    }
    class Leg {
        private int count;
        public Leg(int count) { this.count = count; }
    }
    public String toString() { return "Human is " + head.hair + " and have " + hand.count + " hand, " + leg.count + " leg"; }
    Head head = new Head("blad");
    Hand hand = new Hand(2);
    Leg leg = new Leg(2);
}