import java.util.ArrayList;
import java.util.Arrays;

public class javaAdvancedTask2 {
    public static <List> ArrayList<List> duplicatesRemove(ArrayList<List> list) {
        ArrayList<List> listWithoutDuplicates = new ArrayList<>();
        for (List element : list) {
            if (!listWithoutDuplicates.contains(element)) {
                listWithoutDuplicates.add(element);
            }
        }
        return listWithoutDuplicates;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 2, 2, 2, 1, 4, 5, 7, 8));
        System.out.println("ArrayList with duplicates: " + list);
        ArrayList<Integer> listWithoutDuplicates = duplicatesRemove(list);
        System.out.println("ArrayList without duplicates: " + listWithoutDuplicates);
    }
}