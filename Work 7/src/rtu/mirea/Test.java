package rtu.mirea;

public class Test {
    public static void main(String[] args) {
        Game_stack game0 = new Game_stack();
        game0.Start_game();

        Game_queue game1 = new Game_queue();
        game1.Start_game();

        Game_deque game2 = new Game_deque();
        game2.Start_game();
    }
}
