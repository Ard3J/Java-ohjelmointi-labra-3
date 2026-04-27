import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("Anna", "040 1238 238");
        map.put("Pekka", "040 1379 892");
        map.put("Matti", "041 2681 759");
        map.put("Maija", "044 7531 957");
    
        System.out.println("Valitse nimi: Anna, Pekka, Matti, Maija");
        String input = sc.nextLine();
        System.out.println("Numero on " + map.get(input));
        sc.close();
    }
}
