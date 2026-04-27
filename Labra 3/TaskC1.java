import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String input = "aa";
        while (!input.equals("stop")) {
            System.out.println("Syötä opiskelijoiden nimiä. 'stop' lopettaa");
            input = sc.nextLine();
            if (!input.equals("stop")) {
                list.add(input);
            }
        }
        System.out.println("");     //Siistimmän näköinen
        for (String item : list) {
            System.out.println(item);
        }
        sc.close();
    }
}
