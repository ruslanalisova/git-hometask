public class Lab {
    public static void main(String[] args) {
        Computer laptop1 = new Computer("HP", 2048);
        laptop1.setName("Aha");
        laptop1.setType("laptop");
        laptop1.setNumberOfCores(5);
        Computer desktop1 = new Computer("Dell", 2048);
        desktop1.setName("Bhb");
        desktop1.setType("desktop");
        desktop1.setNumberOfCores(6);
        System.out.println(laptop1);
        System.out.println(desktop1);
    }
}