package TehDian;
import java.util.Scanner;

public class KuisSatu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // // Input data kedalam array
        // int[] numbers = new int[10];

        // // Mencari bilangan maksimal dan minimal dengan data dinamis (diinputkan)
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print("Bilangan ke - " + (i + 1) + " : ");
        // numbers[i] = in.nextInt();
        // }

        // Mencari bilangan maksimal dan minimal dengan data statis
        int[] numbers = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Deklarasi nilai maksimal dan minimal
        int max = numbers[0];
        int min = numbers[0];

        // Proses membandingkan data
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Menampilkan hasil maksimal dan minimal
        System.out.println("Bilangan maksimal : " + max);
        System.out.println("Bilangan minimal : " + min);

        // Menutup variable inputan
        in.close();
    }
}
