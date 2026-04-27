import java.util.Map;
import java.util.TreeMap;

public class TaskA3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(2, "Toinen");
        map.put(1, "Ensimmäinen");
        map.put(4, "Neljäs");
        map.put(3, "Kolmas");

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
