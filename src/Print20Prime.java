import java.util.Scanner;

public class Print20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want print amount prime ? : ");
        int amount = scanner.nextInt();
        int count = 0;
        for (int i = 2; count < amount; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
                count++;
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
