
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r;
        System.out.print("Please Enter n Number : ");
        n = inp.nextInt();
        System.out.print("Please Enter r Number : ");
        r = inp.nextInt();

        int nfactorial = 1, rfactorial = 1, nrfactorial = 1;
        for (int i = 1; i <= n; i++) {
            nfactorial *= i;
        }

        for (int k = 1; k <= r; k++) {
            rfactorial *= k;
        }

        for (int j = 1; j <= (n - r); j++) {
            nrfactorial *= j;
        }
        double combination = nfactorial/(rfactorial*nrfactorial);
        System.out.println("C(" + n + "," + r + "):" + combination);
    }
}
