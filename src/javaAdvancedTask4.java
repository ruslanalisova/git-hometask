import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class javaAdvancedTask4 {
    public static void main(String[] args) {
        String[] orders = {"order1", "order2", "order3", "order4", "order5"};
        HashSet<String> rSet = new HashSet<>();
        rSet.addAll(Arrays.asList(orders));
        System.out.println("Hashset orders:" + rSet);
        TreeSet<String> hSets = new TreeSet<>();
        for (String order : orders) {
            hSets.add(order);
        }
        System.out.println("Treeset orders:" + hSets);
    }
}