package interfaces;

public class Circle implements Shape1, Figure{

    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double getSum() {
        return radius + radius;
    }

    @Override
    public double getArea() {
        return radius*3.14;
    }

    @Override
    public double getPerimetr() {
        return 6.18*radius*radius;
    }
}
