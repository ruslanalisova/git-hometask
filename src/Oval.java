public class Oval extends Round {
    public Oval(int radius) {
        super(radius);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }
}