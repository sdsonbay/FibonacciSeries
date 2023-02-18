import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        List<Integer> fibonacciNumbers = new ArrayList();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);

        for(int i = 0; i < n - 2; i++){
            fibonacciNumbers.add(fibonacciNumbers.get(i) + fibonacciNumbers.get(i + 1));
        }

        System.out.println(fibonacciNumbers);
    }
}
