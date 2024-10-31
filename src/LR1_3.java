import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LR1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введiть розмiр матрицi n (n <= 20): ");
        int n = scanner.nextInt();

        if (n >= 20) {
            System.out.println("Розмiр не повинен перевищувати 20.");
            scanner.close();
            return;
        }
        scanner.close();

        int[][] A = new int[n][n];
        System.out.println("Матриця A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = random.nextInt(10);
                System.out.print("[ " + A[i][j] + " ]");
            }
            System.out.println();
        }

         double[] X = new double[n];

        for (int i = 0; i < n; i++) {
            double sum = 0;
            if (A[i][i] < 0) {
                for (int j = 0; j < i; j++) {
                    sum += Math.abs(A[i][j]);
                }
            } else {
                for (int j = i + 1; j < n; j++) {
                    sum += A[i][j];
                }
            }
            X[i] = sum;
        }

        System.out.println("Вектор X: " + Arrays.toString(X));
    }
}
