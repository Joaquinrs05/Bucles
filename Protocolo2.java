import java.util.Scanner;

public class Protocolo2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // Atributos

        boolean d100 = true, d216 = true, bit7 = true;

        while (true) {

            System.out.println("Pon 0 si queres salir, 1 si quieres ver estádisticas y cualquier cosa para seguir");
            String respuesta = String.valueOf(sc.nextLine());

            if (respuesta.compareTo("0") == 0) {
                System.out.println("Hasta luego");
                break;

            } else if (respuesta.compareTo("1") == 0) {
                System.out.println("Estadistica");

            } else {

                System.out.println("Habilitar inte. por TMRO GIE = TOIE = 1");
                System.out.println("Cargar registro auxiliar Reg1 con d'45'");

                while (d100) {
                    System.out.println("Cargar registro auxiliar Reg2 con d'100'");
                    d216 = true;

                    while (d216) {
                        System.out.println("Cargar TMRO con d'216'");
                        bit7 = true;

                        while (bit7) {
                            System.out.println("¿TMRO Bit7=0?");
                            respuesta = sc.nextLine();

                            if (respuesta.compareTo("s") == 0) {
                                System.out.println("Hace Reg2 - 1");
                                System.out.println("¿Reg2 = 0?");
                                respuesta = sc.nextLine();

                                if (respuesta.compareTo("s") == 0) {
                                    System.out.println("Hace Reg1 - 1");
                                    System.out.println("¿Reg1 = 0?");
                                    respuesta = sc.nextLine();

                                    if (respuesta.compareTo("s") == 0) {
                                        System.out.println("Continua con el programa principal");
                                        d216 = false;
                                        bit7 = false;
                                        d100 = false;

                                    } else {
                                        d216 = false;
                                        bit7 = false;
                                        d100 = true;

                                    }

                                } else {
                                    d216 = true;
                                    bit7 = false;

                                }

                            } else {
                                bit7 = true;
                            }

                        }
                    }

                }
            }
        }

        sc.close();
    }

}
