public class Computer {
    private String name;
    private String brand;
    private String type;
    private int screenSize;
    private int numberOfCores;

    public Computer(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public Computer setName(String name) {
        this.name = name;
        return this;
    }

    public Computer setType(String type) {
        this.type = type;
        return this;
    }

    public Computer setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    @Override
    public String toString() {
        return ("Computer brand: " + brand + " Computer  screen size: " + screenSize + " Computer name: " + name + " Computer type: " + type + " Computer number of corses: " + numberOfCores);
    }
}