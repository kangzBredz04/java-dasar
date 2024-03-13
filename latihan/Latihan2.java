package latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        int batas;
        int tot = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("PROGRAM SEDERHANA MENJUMLAHKAN BEBERAPA BILANGAN");
        System.out.print("Masukan batas : ");
        batas = in.nextInt();
        for (int i = 1; i <= batas; i++) {
            System.out.print("Masukan nilai ke " + i + " : ");
            tot += in.nextInt();
        }
        System.out.println("Total penjumlahan dari nilai yang diinputkan sebesar : " + tot);
        in.close();
    }
}
