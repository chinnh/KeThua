package BaiTap.PointAndMovablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xspeed, float yspeed) {
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ", speed " + xSpeed + "," + ySpeed + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(1.0f, 2.0f);
        System.out.println("Point " + p);
        p.setX(3.0f);
        p.setY(4.0f);
        System.out.println("Point sau khi setX, setY " + p);
        p.setXY(5.0f, 6.0f);
        System.out.println("Point sau khi setXY" + p);
        System.out.println("Array {x, y} " + java.util.Arrays.toString(p.getXY()));

        MovablePoint m = new MovablePoint(1.0f, 2.0f,3.0f, 4.0f);
        System.out.println("MovablePoint " + m);
        m.setX(3.0f);
        m.setY(4.0f);
        m.setXSpeed(5.0f);
        m.setYSpeed(6.0f);
        System.out.println("MovablePoint sau khi setX, setY, setXSpeed và setYSpeed " + m);
        m.move();
        System.out.println("MovablePoint sau khi move " + m);
        m.setSpeed(5.0f, 6.0f);
        m.move();
        System.out.println("MovablePoint sau khi setSpeed và move " + m);
        System.out.println("Array {x, y, speed} " + java.util.Arrays.toString(m.getSpeed()));
    }
}

