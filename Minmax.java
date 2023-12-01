
import java.util.Scanner;

public class Minmax {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Entrada

        int divisorMax = 0;

        System.out.print("Ingrese un número entero");
        int x = scanner.nextInt();
        System.out.print("Ingrese otro número entero");
        int y = scanner.nextInt();

        int num1 = Math.min(x, y);
        int multXY = x * y;
        int multMin = multXY;

        // Persistencia

        for (int k = 1; k <= num1; k++) {
            if (x % k == 0 && y % k == 0) {
                divisorMax = k;

            }
        }
        System.out.println("El MCD de" + x + y + "es" + divisorMax);

        for (int i = multXY; i >= Math.max(x, y); i--) {
            if (i % x == 0 && i % y == 0) {

                multMin = i;
            }
        }
        System.out.println("El MCM de" + x + y + "es" + multMin);

        scanner.close();
    }

}
