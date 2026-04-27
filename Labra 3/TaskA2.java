import java.util.ArrayList;
import java.util.List;

public class TaskA2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("omena");
        list.add("banaani");
        list.add("persikka");
        list.add("päärynä");
        list.add("mango");
        list.sort((a,b) -> a.length() - b.length());
        for (String item : list) {
            System.out.println(item);
        }
    }
}
