public class NumberHolder {
    public int anInt;
    public float aFloat;

    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    public String toString() {
        return ("First variable: " + anInt + " Second variable: " + aFloat);
    }
}