public class Rect extends Rectangle {
    Rect(int length, int width) {
        super(length, width);
    }

    public double getSquare() {
        return length * width;
    }
}