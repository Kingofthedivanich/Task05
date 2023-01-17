import java.util.Scanner;

public class Main {

    public static final String PRINT_MESSAGE = "Введите целое положительное число:";

    public static int scanInt() {
        int N = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(PRINT_MESSAGE);
            while (!scanner.hasNextInt()){
                System.out.println(PRINT_MESSAGE);
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);
        return N;
    }

    public static boolean parity(int i) {
        if (i % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void printFigure(int h) {

        for (int i = 1; i <= h; i++){
            int num = i;
            do {
                if (!parity(num)){
                    num--;
                    System.out.print("a");
                } else {
                    num--;
                    System.out.print("b");
                }
            } while (num > 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int h = scanInt();

        printFigure(h);
    }
}