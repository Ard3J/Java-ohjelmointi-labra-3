import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String input = "aa";
        while (!input.equals("stop")) {
            System.out.println("Syötä opiskelijoiden nimiä. 'stop' lopettaa");
            input = sc.nextLine();
            if (!input.equals("stop")) {
                set.add(input);
            }
        }
        System.out.println("");     //Siistimmän näköinen
        System.out.println("Uniikkeja nimiä: " + set.size());
        sc.close();
    }
}
