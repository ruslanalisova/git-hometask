public class ShapeCalc {
    public static void main(String[] args) {
        // Creating the Object of Rectangle class
        // and using shape interface reference.
        Shape rect = new Rectangle(2, 3) {

        };

        System.out.println("Area of rectangle: "
                + rect.getSquare());

        // Creating the Objects of circle class
        Shape circle = new Round(2) {

        };

        System.out.println("Area of circle: "
                + circle.getSquare());


        Shape circle2 = new Circle(4) {

        };

        System.out.println("Area of circle: "
                + circle2.getSquare());

        Shape oval = new Oval(3) {

        };

        System.out.println("Area of circle: "
                + oval.getSquare());
        Shape square = new Square(3, 6) {

        };

        System.out.println("Area of circle: "
                + square.getSquare());
    }

}