public class Computers {
    private String name;
    private String brand;
    private String type;
    private int screenSize;
    private int numberOfCores;

    public Computers(String name, String brand, String type, int screenSize, int numberOfCores) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return ("Computer brand: "  + brand + " Computer  screen size: " + screenSize);
    }
}
