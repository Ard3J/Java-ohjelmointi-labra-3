import java.util.TreeSet;

public class TaskS3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(2);

        for (Integer item : set) {
            System.out.println(item);
        }
    }
}
