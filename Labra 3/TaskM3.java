import java.util.HashMap;
import java.util.Map;

public class TaskM3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Punainen");
        map.put(2,"Sininen");
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}
