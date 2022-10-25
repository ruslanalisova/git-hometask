public abstract class Round implements Shape {


    double pi = 3.14;
    int radius;

    // constructor
    Round(int radius) {
        this.radius = radius;
    }


    @Override
    public double getSquare() {

        return (double) ((pi * radius * radius));
    }
}