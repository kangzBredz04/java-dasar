package latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        int bil;
        int hasil = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("PROGRAM MENAMPILKAN PERHITUNGAN BILANGAN FAKTORIAL");
        System.out.print("Masukan bilangan bulat : ");
        bil = in.nextInt();

        if (bil < 0) {
            System.out.println("Masukan bilangan bulat!");
        } else {
            System.out.print("Bilangan faktorial dari 4 adalah ");
            for (int i = 1; i <= bil; i++) {
                System.out.print(i + ", ");
                hasil *= i;
            }
            System.out.println();
            System.out.println("Hasilnya = " + hasil);
        }
    }
}
