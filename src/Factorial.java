import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = inp.nextInt();
        int factorial = 1;
        while (sayi > 0) {
            factorial *= sayi;
            sayi--;
        }
        System.out.println("Factorial " + factorial);
    }
}
