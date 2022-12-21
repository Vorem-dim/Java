package rtu.mirea;

public abstract class Shape {
    int x, y;
    char col1, col2, col3;

    public abstract void Rect(int x, int y, char col1, char clo2, char col3);
    public abstract void Circle(int x, int y, char col1, char clo2, char col3);
    public abstract void Oval(int x, int y, char col1, char clo2, char col3);
}
