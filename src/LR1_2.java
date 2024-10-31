import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LR1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть кiлькiсть елементiв масиву n (n <= 200): ");
        int n = scanner.nextInt();

        scanner.close();

        if (n > 200) {
            System.out.println("Кількiсть не повинна перевищувати 200.");
            return;
        }

        int[] A = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(10);
        }

        System.out.println("Масив A:");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + A[i] + "]");
        }
        System.out.println();

        double[] B = new double[n];
        
        for (int i = 0; i < n; i++) {
            double sum = 0.0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    sum += A[j];
                }
            }
            B[i] = sum / (n - 1);
        }
        
        System.out.println("Масив A: " + Arrays.toString(A));
        System.out.println("Масив B: " + Arrays.toString(B));
    }
}
