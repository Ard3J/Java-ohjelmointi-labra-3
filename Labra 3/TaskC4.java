import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");   //Ääkköset toimii, mutta näyttää hassulta
        Map<String, Integer> wordcount = new HashMap<>();
        System.out.println("Anna lause: ");
        String input = sc.nextLine().toLowerCase();
        String[] words = input.split("[^\\p{L}]+");
        for (String word : words) {
            if (wordcount.containsKey(word)) {
                int count = wordcount.get(word);
                wordcount.put(word, count + 1);
            }
            else {
                wordcount.put(word, 1);
            }
        }
        System.out.println("");
        for (Map.Entry<String, Integer> item : wordcount.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
        sc.close();
    }
}
