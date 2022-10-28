public abstract class Rectangle implements Shape {
    int length, width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getSquare() {
        return (double) (length * width);
    }
}