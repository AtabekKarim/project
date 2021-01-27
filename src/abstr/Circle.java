package abstr;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    double getPerimetr() {
        return 2*3.14*radius;
    }

    @Override
    public void printArea() {
        super.printArea();
    }

    @Override
    public void printPerimetr() {
        super.printPerimetr();
    }
}
