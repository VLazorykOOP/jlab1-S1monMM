import java.util.ArrayList;
import java.util.Scanner;

public class LR1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введiть текст: ");
        String text = scanner.nextLine();
        
        scanner.close();
        

        String[] words = text.split("[\\p{Punct}\\s]+");

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() % 2 == 0) {
                result.add(word);
            }
        }
        String output = String.join(" ", result);
        System.out.println("Результат: " + output);
    }
}

