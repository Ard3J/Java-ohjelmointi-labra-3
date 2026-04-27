import java.util.List;
import java.util.ArrayList;

public class TaskL6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        for (Integer item : list ) {
            System.out.println(item);
        }
    }
}