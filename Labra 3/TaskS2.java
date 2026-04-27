import java.util.HashSet;
import java.util.Set;

public class TaskS2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(4);
        for (Integer item : set) {
            System.out.println(item);
        }
    }
}
