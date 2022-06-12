import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        int value;

        System.out.print("Define number of N: ");
        value = scan.nextInt();

        System.out.print("Value invert: ");
        Recursive(value);

    }

    public static int Recursive(int valueInvert) {

        int valueReserv = valueInvert;

        if (valueReserv == 0) {
            return 0;
        } else {
            valueReserv = valueReserv % 10;
            valueInvert = valueInvert / 10;
            System.out.print(valueReserv);
            return Recursive(valueInvert);
        }

    }
}
