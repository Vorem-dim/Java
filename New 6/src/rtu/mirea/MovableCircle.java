package rtu.mirea;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        System.out.println("Radius - " + radius + super.toString());
        return "";
    }

    @Override
    public void moveUp(int temp) {
        super.moveUp(temp);
    }

    @Override
    public void moveDown(int temp) {
        super.moveDown(temp);
    }

    @Override
    public void moveLeft(int temp) {
        super.moveLeft(temp);
    }

    @Override
    public void moveRight(int temp) {
        super.moveRight(temp);
    }
}
