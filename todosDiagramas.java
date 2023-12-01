import java.util.Scanner;

public class todosDiagramas {
    public static void main(String[] args) {
        int opcion = 1;

        while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
            Scanner input = new Scanner(System.in);
            System.out.println(
                    "----------------------------------------\n1.- Diagrama Web\n2.- Diagrama Vertical\n3.- Diagrama Problemas\n4.- Diagrama Soporte\n5.- Salir\n----------------------------------------\n");
            opcion = Integer.valueOf(input.nextLine());
            input.close();

            if (opcion == 1) {
                Diagrama1();
            } else if (opcion == 2) {
                Diagrama2();
            } else if (opcion == 3) {
                Diagrama3();
            } else if (opcion == 5) {
                System.out.println("Hasta la proxima!!\nSaliendo...");
                opcion = 0;
            }
        }
    }

    public static void Diagrama1() {
        System.out.println(
                "Recuiting\n Hiring manager gets personal request \n Job description received from hiring \n create ad placement to post on website \n Receive and send Resumes to hiring");
        int iContador = 1;
        Scanner input = new Scanner(System.in);
        while (iContador == 1) {
            iContador = 0;
            System.out.println("Suitable Cnadidate found?");
            String respuesta1 = input.nextLine();
            if (respuesta1.compareToIgnoreCase("No") == 0) {
                System.out.println("Continue running ads");
                iContador = 1;
            } else if (respuesta1.compareToIgnoreCase("yes") == 0) {
                System.out.println(
                        "Coordinate aplicant\n Coordinate aditional Scanning necesary\n If aplicant pases Screaning");
                System.out.println("Aplicant accept ofert?");
                String repuesta2 = input.nextLine();
                if (repuesta2.compareToIgnoreCase("No") == 0) {
                    System.out.println("Continue Running Ads");
                    iContador = 1;
                } else if (repuesta2.compareToIgnoreCase("Yes") == 0) {
                    System.out.println("On boarding");
                }
            }
        }
        input.close();
    }

    public static void Diagrama2() {
        System.out.println("Habilitar inte. por TMR0 GIE = T0IE = 1\n Cargar registra auxiliar Reg1 con d'45");
        int reg100 = 1;
        int reg216 = 1;
        Scanner input = new Scanner(System.in);
        while (reg100 == 1) {
            reg100 = 0;
            System.out.println("Cargar registro auxuliar reg2 con 100");

            while (reg216 == 1) {
                reg216 = 0;
                System.out.println("Cargar tmr0 con d216");
                System.out.println("TMR0 Bit87 =0?");
                String registro1 = input.nextLine();
                if (registro1.compareToIgnoreCase("No") == 0) {
                    reg216 = 1;
                } else if (registro1.compareToIgnoreCase("Si") == 0) {
                    System.out.println("Hace reg2 -1");
                    System.out.println("reg2 = 0?");
                    String registro2 = input.nextLine();

                    if (registro2.compareToIgnoreCase("No") == 0) {
                        reg216 = 1;
                    } else if (registro2.compareToIgnoreCase("Si") == 0) {
                        System.out.println("Hace reg1-1");
                        System.out.println("Reg1 = 0?");
                        String registro3 = input.nextLine();

                        if (registro3.compareToIgnoreCase("No") == 0) {
                            reg100 = 1;
                            reg216 = 1;
                        } else if (registro3.compareToIgnoreCase("Si") == 0) {
                            System.out.println("Continua con el programa principal\n Fin");
                        }
                    }
                }
            }
        }
        input.close();
    }

    public static void Diagrama3() {
        System.out.println("----------------------\n ¡Empezamos!\n ----------------------");
        int ibucle1 = 1;
        int ibucle2 = 1;
        Scanner input = new Scanner(System.in);
        while (ibucle1 == 1) {
            ibucle1 = 0;
            System.out.print("¿funciona?");
            String respuesta1 = input.nextLine();
            if (respuesta1.compareToIgnoreCase("si") == 0) {
                System.out.println("¿No lo toques!\n Terminaste sin problemas");
            } else if (respuesta1.compareToIgnoreCase("No") == 0) {
                System.out.println("¿Lo tocaste?");
                String respuesta2 = input.nextLine();

                if (respuesta2.compareToIgnoreCase("Si") == 0) {
                    System.out.println("¡La cagaste!");
                    System.out.println("¿Lo sabe alguien?");
                    String respuesta3 = input.nextLine();

                    if (respuesta3.compareToIgnoreCase("No") == 0) {
                        System.out.println("¡Escondelo!");
                    } else {
                        while (ibucle2 == 1) {
                            ibucle2 = 0;
                            System.out.println("¡Pobre imbecil!");
                            System.out.println("¿Puedes culpar a alguien?");
                            String respuesta4 = input.nextLine();

                            if (respuesta4.compareToIgnoreCase("S") == 0) {
                                System.out.println("Terminaste sin problemas");
                            } else {
                                ibucle2 = 1;
                            }
                        }
                        ;
                    }
                }
            }
        }
        input.close();
    }
}
