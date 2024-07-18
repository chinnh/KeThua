package BaiTap.Point2DAndPoint3D;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D(float x, float y, float z) {
        super();
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.getZ()};
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
    }

    public static void main(String[] args) {
        Point2D p2d = new Point2D(3.0f, 4.0f);
        System.out.println("Point2D " + p2d);
        p2d.setX(3.5f);
        p2d.setY(4.5f);
        System.out.println("Point2D sau khi setX và setY" + p2d);
        p2d.setXY(5.5f, 6.5f);
        System.out.println("Point2D sau khi setXY " + p2d);
        Point3D p3d = new Point3D(3.0f, 4.0f, 5.5f);
        System.out.println("Point3D " + p3d);
        p3d.setX(2.5f);
        p3d.setY(4.5f);
        p3d.setZ(5.5f);
        System.out.println("Point3D sau khi setX, setY, setZ " + p3d);
        p3d.setXYZ(5.5f, 6.5f, 7.5f);
        System.out.println("Point3D sau khi setXYZ " + p3d);
        System.out.println("Array{x, y, z} " + java.util.Arrays.toString(p3d.getXYZ()));
    }
}
