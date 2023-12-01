import java.util.Scanner;

public class WebDeploy {
    public static void main(String[] args) {
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
}
