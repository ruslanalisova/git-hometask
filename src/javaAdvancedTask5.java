import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class javaAdvancedTask5 {

    public static void main(String[] args) {
        ArrayList<String> firstVariant = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        ArrayList<String> secondVariant = new ArrayList<>(Arrays.asList("i", "j", "k"));

        System.out.println(combine(firstVariant, secondVariant));
    }
    public static <K, V> Map<K, V> combine(List<K> listOne, List<V> listTwo) {
        Map<K, V> resultMap = new HashMap<>();

        for (int i = 0; i < listTwo.size(); i++) {
            if (listTwo.get(i) == listTwo.get(listTwo.size() - 1)) {
                resultMap.put(listOne.get(i), listTwo.get(i));
                for (int j = i + 1; j < listOne.size(); j++) {
                    resultMap.put(listOne.get(j), null);
                }
            } else {
                resultMap.put(listOne.get(i), listTwo.get(i));
            }
        }

        return resultMap;
    }

}