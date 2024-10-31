import java.util.Scanner;

public class LR1_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Дiйсне значення a: ");
        double x = scan.nextDouble();
        
        System.out.print("Дiйсне значення b: ");
        double y = scan.nextDouble();
        
        scan.close();
        
        double result1 = ((1/(x + y)) + (1/((Math.pow(x, 2) + (Math.pow(y, 2))))) * (x - y));
        System.out.println("Дiйснi вхiднi, дiйсний результат: " + result1);

        int xInt = (int) x;
        int yInt = (int) y;
        double result2 = ((1/(xInt + yInt)) + (1/((Math.pow(xInt, 2) + (Math.pow(yInt, 2))))) * (xInt - yInt));
        System.out.println("Цiлi вхiднi, дiйсний результат: " + result2);
        
        int result3 = (int) ((1/(x + y)) + (1/((Math.pow(x, 2) + (Math.pow(y, 2))))) * (x - y));
        System.out.println("Дiйснi вхiднi, цiлий результат: " + result3);
    }
}