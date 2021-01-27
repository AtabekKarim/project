package abstr;

public abstract class Shape {

    abstract double getArea();
    abstract double getPerimetr();

    public void printArea(){
        System.out.println("Area is " + getArea());
    }

    public void printPerimetr(){
        System.out.println("perimetr is " + getPerimetr());
    }
}
