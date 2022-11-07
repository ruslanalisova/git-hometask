import java.util.Random;
public class Vector {
    private int x;
    private int y;
    private int z;
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double lenght() {
        return Math.sqrt( Math.pow (x,2) + Math.pow(y,2) + Math.pow (z,2));
    }
    public int scalarProduct(Vector that) {
        double p = this.x * that.x + this.y + that.y + this.z * that.z;
        return (int) p;
    }
    public int scalarProduct() {
        Vector [] vector = randomVectors(2);
        Vector firstVector = vector[0];
        return this.x * firstVector.x + this.y + firstVector.z + this.z * firstVector.z;
    }
    public String toString() {
        return "Vector(" + x + "," + y + "," + z + ")";
    }
    public static Vector [] randomVectors(int n) {
        Vector[] v = new Vector[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            v[i] = new Vector(rand.nextInt(20), rand.nextInt(20), rand.nextInt(20));
        }
        return v;
    }
}