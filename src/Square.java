
public class Square extends Rectangle {
    Square(int length, int width) {
        super(length, width);
    }

    public double getSquare() {
        return length * length;
    }
}