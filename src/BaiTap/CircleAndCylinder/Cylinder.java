package BaiTap.CircleAndCylinder;

import java.awt.*;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
        this.height = 1.0;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height = " + height + "," + super.toString() + '}';
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(3.0, "blue");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(3.0);
        Cylinder cylinder3 = new Cylinder(2.5, 5.0);
        Cylinder cylinder4 = new Cylinder(1.5, 7.0, "green");
        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println(cylinder4);
        System.out.println("Diện tích của circle3: " + circle3.getArea());
        System.out.println("Thể tích của cylinder4: " + cylinder4.getVolume());
    }
}
