public class Oval extends Round {
    public Oval(int radius) {
        super(radius);
        this.radius = radius;
    }
    @Override
    public double getSquare() {
        return PI * Math.pow(radius, 2);
    }
}