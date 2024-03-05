import java.util.Scanner;

public class KuisSatu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input data kedalam array
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Bilangan ke - " + (i + 1) + " : ");
            numbers[i] = in.nextInt();
        }

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
