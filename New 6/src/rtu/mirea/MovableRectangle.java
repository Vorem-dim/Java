package rtu.mirea;

public class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft, botoomRight;
    public MovableRectangle(int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        topLeft = new MovablePoint(x, y, xSpeed, ySpeed);
        botoomRight = new MovablePoint(y, x, xSpeed, ySpeed);
    }
    public boolean SpeedTest() {
        if (topLeft.xSpeed == botoomRight.xSpeed && topLeft.ySpeed == botoomRight.ySpeed)
            return true;
        else
            return false;
    }
    @Override
    public String toString() {
        return super.toString();
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
