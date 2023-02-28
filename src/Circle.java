public class Circle extends Round {
    public Circle(int radius) {
        super(radius);
        this.radius = radius;
    }
    @Override
    public double getSquare() {
        return PI * Math.pow(radius, 2);
    }
}