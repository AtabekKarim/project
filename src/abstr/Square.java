package abstr;

public class Square extends Shape {
    private double width;

    public Square(double width){
        this.width = width;
    }

    @Override
    double getArea() {
        return width*width;
    }

    @Override
    double getPerimetr() {
        return 4*width;
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
