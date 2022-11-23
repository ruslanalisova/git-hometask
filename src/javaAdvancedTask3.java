import java.util.HashMap;
import java.util.Map;
public class javaAdvancedTask3 {
    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(101, "Cricket");
        hMap.put(105, "Hockey");
        hMap.put(111, "Basketball");
        System.out.println("HashMap elements: ");
        System.out.println (hMap);
        System.out.println("HashMap elements reverse: ");
        System.out.println(reverse(hMap));
    }
        public static <K,V> HashMap<V,K> reverse(Map<K,V> map) {
            HashMap<V,K> rev = new HashMap<V, K>();
            for(Map.Entry<K,V> entry : map.entrySet())
                rev.put(entry.getValue(), entry.getKey());

            return rev;
        }
    }