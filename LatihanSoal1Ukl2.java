import java.util.Scanner;

public class LatihanSoal1Ukl2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif:");
        int b = input.nextInt();

        long hasil = faktorial(b);
        System.out.print("Faktorial dari " + b + " adalah: " + hasil);

        input.close();
    }

    private static long faktorial(int b) {
        if (b == 0 || b == 1) {
            return 1;
        } else {
            return b * faktorial(b - 1);
        }
    }

}

