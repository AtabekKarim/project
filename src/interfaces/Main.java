package interfaces;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(25.30);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getSum());
    }
}