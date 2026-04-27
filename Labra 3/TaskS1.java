import java.util.Set;
import java.util.HashSet;

public class TaskS1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Aurinko");
        set.add("Kuu");
        for (String item : set) {
            System.out.println(item);
        }
    }
    
}
