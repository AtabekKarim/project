package abstr;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(14);
        Square square = new Square(25);
        Shape shapes[] = {circle, square};

        for (Shape s: shapes){
            s.printArea();
            s.printPerimetr();
        }
    }
}
