import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value;

        System.out.print("Define number of N: ");
        value = scan.nextInt();

        System.out.println("Value this = " + value);

        System.out.println("Factorial is: " + Recursive(value));

    }

    public static int Recursive(int valueEnd) {

        if (valueEnd != 1) {
            return valueEnd * Recursive(valueEnd - 1);
        }

        return 1;
    }
}