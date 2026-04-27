import java.util.List;
import java.util.ArrayList;

public class TaskL4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove(1);
        for (String item : list) {
            System.out.println(item);
        }
    }
}