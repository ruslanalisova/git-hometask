public abstract class Round implements Shape {
    public static final double PI = 3.14159;
    int radius;
    Round(int radius) {
        this.radius = radius;
    }
    @Override
    public double getSquare() {
        return (double) ((PI * radius * radius));
    }
}