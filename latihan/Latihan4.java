package latihan;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("Masukkan nomor positif (masukkan negatif untuk keluar): ");
            input = scanner.nextInt();

            if (input >= 0) {
                System.out.println("Anda memasukkan nomor positif: " + input);
            } else {
                System.out.println("Program berhenti.");
            }

        } while (input >= 0);

        scanner.close();
    }
}
