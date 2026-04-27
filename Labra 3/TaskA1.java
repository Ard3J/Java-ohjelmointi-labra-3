import java.util.ArrayList;
import java.util.List;

public class TaskA1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("c");

        list.sort(null);        //Oletusarvoisesti nouseva järjestys
        for (String item : list) {
            System.out.println(item);
        }
    }
}
