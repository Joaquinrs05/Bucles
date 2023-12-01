import java.util.Scanner;

public class ejercicio3examen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iMenu = 1;
        int iplanteamiento = 0;
        int iErrores = 0;
        int iProgramas = 0;
        while (iMenu == 1) {
            iMenu = 0;
            System.out.println("1. realizar software\n2. Mostrar estadisticas\n3. Salir");
            int respuesta1 = input.nextInt();

            if (respuesta1 == 1) {
                System.out.println(
                        "------------------\nRealizar un programa\n ------------------\nDetermino la funcion del programa");
                int ibucle1 = 1;
                while (ibucle1 == 1) {
                    ibucle1 = 0;
                    System.out.println("Planteo el programa");
                    System.out.println("Abro el compilador");
                    iplanteamiento++;
                    int ibucle2 = 1;
                    while (ibucle2 == 1) {
                        ibucle2 = 0;
                        System.out.println("¿tengo dudas?");
                        String respuesta2 = input.nextLine();

                        if (respuesta2.compareToIgnoreCase("si") == 0) {
                            System.out.println("repaso teoria");
                            ibucle2 = 1;
                            ibucle1 = 1;
                        } else if (respuesta2.compareToIgnoreCase("no") == 0) {

                            System.out.println("pulsa tecla para compilar");
                            System.out.println("¿hay algun error?");
                            ibucle2 = 0;
                            String respuesta3 = input.nextLine();

                            if (respuesta3.compareToIgnoreCase("si") == 0) {
                                System.out.println("Corrigo error fuente");
                                iErrores++;
                                ibucle2 = 1;
                            } else {
                                System.out.println("ejecuto el programa");
                                System.out.println("¿Realiza corrextamente su funcion?");
                                String respuesta4 = input.nextLine();

                                if (respuesta4.compareToIgnoreCase("si") == 0) {
                                    System.out.println("Guardo codigo fuente");
                                    System.out.println("cierro el compilador");
                                    System.out.println("Has terminado");
                                    iProgramas++;
                                } else {
                                    System.out.println("¿Es un error de planteamiento?");
                                    String respuesta5 = input.nextLine();

                                    if (respuesta5.compareToIgnoreCase("Si") == 0) {
                                        ibucle1 = 1;
                                    } else {
                                        System.out.println("Corrigo error fuente");
                                        iErrores++;
                                        ibucle2 = 1;
                                    }
                                }
                            }
                        }
                    }

                }
            } else if (respuesta1 == 2) {
                System.out.println("las estadisticas son");
                System.out.println("numero de programas: " + iProgramas);
                System.out.println("numero de errores: " + iErrores);
                System.out.println("numero de planteamientos: " + iplanteamiento);
            } else if (respuesta1 == 3) {
                iMenu = 0;
            }
        }
        input.close();
    }
}