import java.util.Scanner;

public class partidaexamen {
    public static void main(String[] args) {
        // presistencia
        int iturno = 1;
        int imenu = 1;
        int jugador = 0;
        int Android = 0;
        int empate = 0;
        Scanner input = new Scanner(System.in);

        // proceso
        while (imenu == 1) {
            System.out.println("----------------\n 1. Empezar partida \n 2. Estadisticas\n 3. salir\n----------------");
            String respuestamenu = input.nextLine();
            if (respuestamenu.compareTo("1") == 0) {
                System.out.println("Inicio");
                System.out.println("Solo puedes responder Si o No");
                iturno = 1;
                while (iturno == 1) {
                    System.out.println("----------------------\n Turno jugador\n Comprobar fichas");
                    System.out.println("¿existen 2 fichas alineadas?");
                    System.out.println("Solo puedes responder J, A o N, cualquier otra cosa no funcionara");
                    String respuesta1 = input.nextLine();

                    if (respuesta1.compareToIgnoreCase("N") == 0) {
                        System.out.println("Pongo en un espacio vacio");
                        System.out.println("¿está todo el tablero ocupado?");
                        String respuesta2 = input.nextLine();

                        if (respuesta2.compareToIgnoreCase("Si") == 0) {
                            System.out.println("Es un empate ");
                            empate++;
                            iturno = 0;
                        } else {
                            iturno = 1;
                        }
                    } else if (respuesta1.compareToIgnoreCase("A") == 0) {
                        System.out.println("Pongo en el tercer hueco para ganar");
                        System.out.println("gana Android");
                        Android++;
                        iturno = 0;
                    } else if (respuesta1.compareToIgnoreCase("J") == 0) {
                        System.out.println("Pongo en el tercer hueco para evitar perder");
                        System.out.println("¿ha ganado el jugador?");
                        String respuesta3 = input.nextLine();

                        if (respuesta3.compareToIgnoreCase("Si") == 0) {
                            System.out.println("Gana el jugador");
                            jugador++;
                            iturno = 0;
                        } else if (respuesta3.compareToIgnoreCase("No") == 0) {
                            System.out.println("¿esta todo el tablero ocupado?");
                            String respuesta4 = input.nextLine();

                            if (respuesta4.compareToIgnoreCase("Si") == 0) {
                                System.out.println("hay un empate");
                                empate++;
                                iturno = 0;
                            } else if (respuesta4.compareToIgnoreCase("No") == 0) {
                                iturno = 1;
                            }
                        }
                    }
                }

            } else if (respuestamenu.compareTo("2") == 0) {
                System.out.println(" las estadisticas son: ");
                System.out.println("El jugador ha ganado: " + jugador + " veces");
                System.out.println("Android ha ganado: " + Android + " veces");
                System.out.println("la partida ha sido empatada: " + empate + " veces");
            } else if (respuestamenu.compareTo("3") == 0) {
                System.out.println("adios");
                imenu = 0;
            }
        }
        input.close();
    }
}
