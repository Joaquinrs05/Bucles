import java.util.Scanner;

public class Problemas {
    public static void main(String[] args) {
        System.out.println("----------------------\n ¡Empezamos!\n ----------------------");
        int ibucle1 = 1;
        int ibucle2 = 1;
        Scanner input = new Scanner(System.in);
        while (ibucle1 == 1) {
            System.out.print("¿funciona?");
            String respuesta1 = input.nextLine();
            if (respuesta1.compareToIgnoreCase("si") == 0) {
                System.out.println("¿No lo toques!\n Terminaste sin problemas");
                ibucle1 = 0;
            } else if (respuesta1.compareToIgnoreCase("No") == 0) {
                System.out.println("¿Lo tocaste?");
                String respuesta2 = input.nextLine();

                if (respuesta2.compareToIgnoreCase("Si") == 0) {
                    System.out.println("¡La cagaste!");
                    System.out.println("¿Lo sabe alguien?");
                    String respuesta3 = input.nextLine();

                    if (respuesta3.compareToIgnoreCase("No") == 0) {
                        System.out.println("¡Escondelo!\n Terminaste sin problemas");
                        ibucle1 = 0;
                    } else if (respuesta3.compareToIgnoreCase("Si") == 0) {

                    }
                    {
                        while (ibucle2 == 1) {
                            ibucle2 = 0;
                            System.out.println("¡Pobre imbecil!");
                            System.out.println("¿Puedes culpar a alguien?");
                            String respuesta4 = input.nextLine();

                            if (respuesta4.compareToIgnoreCase("Si") == 0) {
                                System.out.println("Terminaste sin problemas");
                                ibucle2 = 0;
                                ibucle1 = 0;
                            } else {
                                ibucle2 = 1;
                            }
                        }

                    }
                } else {
                    System.out.println("¿Tendras problemas?");
                    String respuesta5 = input.nextLine();
                    if (respuesta5.compareToIgnoreCase("No") == 0) {
                        System.out.println("Olvidate del tema\n Sin problemas");
                        ibucle1 = 0;
                    } else {
                        while (ibucle2 == 1) {
                            ibucle2 = 0;
                            System.out.println("¡Pobre imbecil!");
                            System.out.println("¿Puedes culpar a alguien?");
                            String respuesta4 = input.nextLine();

                            if (respuesta4.compareToIgnoreCase("Si") == 0) {
                                System.out.println("Terminaste sin problemas");
                                ibucle2 = 0;
                                ibucle1 = 0;
                            } else {
                                ibucle2 = 1;
                            }
                        }
                    }
                }
            }
        }
        input.close();
    }

}