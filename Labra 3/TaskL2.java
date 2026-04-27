import java.util.List;
import java.util.ArrayList;

public class TaskL2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        for (Integer item: list) {
            System.out.println(item);
        }
    }
}