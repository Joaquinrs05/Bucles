public class gasesideales {
    public class gases {
        public static void main(String args[]) {

            double k = 8.314, t = 0;
            int v = 1, p = 1, n;

            // Persistencia V*p=T*n===T=V*P/n*k

            for (n = 1; n <= 50; n++) {

                t = (v * p) / (n * k);

                System.out.println("La temperatura es: " + t + " k");

            }
        }
    }

}
