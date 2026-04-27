import java.util.HashMap;
import java.util.Map;

public class TaskM2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
