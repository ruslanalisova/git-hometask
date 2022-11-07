public class ShapeCalc {
    public static void main(String[] args) {
        Shape rect = new Rectangle(2, 3) {
        };
        System.out.println("Area of rectangle: " + rect.getSquare());
        Shape circle = new Round(2) {
        };
        System.out.println("Area of circle: " + circle.getSquare());
        Shape circle2 = new Circle(4) {
        };
        System.out.println("Area of circle: " + circle2.getSquare());
        Shape oval = new Oval(3) {
        };
        System.out.println("Area of circle: " + oval.getSquare());
        Shape square = new Square(3, 6) {
        };
        System.out.println("Area of circle: " + square.getSquare());
    }
}