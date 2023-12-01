import java.util.Scanner;

public class sueldosexamen {
    public static void main(String[] args) {
        // Entrada
        Scanner input = new Scanner(System.in);
        int iMaximo = 60000;
        int iMinino = 10000;
        int ibucle1 = 1;
        double IRPF = 1;
        int itramo1 = 10000;
        int itramo12 = 30000;
        int itramo2 = 30001;
        int itramo22 = 50000;
        int itramo3 = 50001;
        int itramo32 = 60000;

        float isueldototal = 0;
        double iIRPFtotal = 0;
        // Proceso
        while (ibucle1 == 1) {

            System.out.println("¿Cual es tu sueldo?");

            int sueldo = input.nextInt();
            if (sueldo < iMinino || sueldo > iMaximo) {
                System.out.println("Numero incorrecto");
                ibucle1 = 0;
            } else {
                System.out.println("vamos a calcular ");
                if (sueldo >= itramo1 && sueldo <= itramo12) {
                    IRPF = sueldo * 0.1;
                    iIRPFtotal = IRPF + iIRPFtotal;
                    iIRPFtotal++;
                    isueldototal = sueldo + isueldototal;
                    isueldototal++;
                    System.out.println("Su sueldo es " + sueldo + " el IRPF es el 10% que es " + IRPF);
                } else if (sueldo >= itramo2 && sueldo <= itramo22) {
                    IRPF = sueldo * 0.15;
                    iIRPFtotal = IRPF + iIRPFtotal;
                    iIRPFtotal++;
                    isueldototal = sueldo + isueldototal;
                    isueldototal++;
                    System.out.println("Su sueldo es " + sueldo + " el IRPF es el 15% que es " + IRPF);
                } else if (sueldo >= itramo3 && sueldo <= itramo32) {
                    IRPF = sueldo * 0.2;
                    iIRPFtotal = IRPF + iIRPFtotal;
                    iIRPFtotal++;
                    isueldototal = sueldo + isueldototal;
                    isueldototal++;
                    System.out.println("Su sueldo es " + sueldo + " el IRPF es el 20% que es " + IRPF);
                }
                System.out.println("-----------\n La cantidad total de sueldo es " + isueldototal + " y de IRPF es "
                        + iIRPFtotal + "\n--------------");
            }
        }

        input.close();
    }
}
