public class VectorCalc {
    public static void main(String[] args) {
        Vector[] v = Vector.randomVectors(2);
        Vector v1 = v[0];
        Vector v2 = v[1];
        System.out.println("v1 is " + v1 + ", length = " + v1.lenght());
        System.out.println("v2 is " + v2 + ", length = " + v2.lenght());
        System.out.println("scalar product of v1 and v2 is " + v1.scalarProduct(v2));
        System.out.println("scalar product of v1 and v2 is " + v1.scalarProduct());
    }
}